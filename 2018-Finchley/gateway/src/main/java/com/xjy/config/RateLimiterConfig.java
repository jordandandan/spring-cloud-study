package com.xjy.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Mono;

/**
 * 限流配置
 *
 * @author bjxujiayi
 * @create 2019-04-08 16:53
 **/
@Configuration
public class RateLimiterConfig {
    @Bean(value = "remoteAddrKeyResolver")
    public KeyResolver remoteAddrKeyResolver() {
        // 按ip为key
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
    }

    @Bean(value = "remoteUserIdKeyResolver")
    public KeyResolver remoteUserIdKeyResolver() {
        // 按userId为key
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("userId"));
    }
    @Bean(value = "remoteUriKeyResolver")
    public KeyResolver remoteUriKeyResolver() {
        // 按请求路径为key
        return exchange -> Mono.just(exchange.getRequest().getPath().value());
    }

}
