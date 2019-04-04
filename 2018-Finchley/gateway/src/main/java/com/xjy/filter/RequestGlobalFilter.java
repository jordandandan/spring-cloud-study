package com.xjy.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

/**
 * 全局过滤器
 *
 * @author bjxujiayi
 * @create 2019-04-02 18:32
 **/
@Component
public class RequestGlobalFilter implements GlobalFilter,Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        String uri = request.getURI().toString();
        System.out.println(" uri : " + uri);//打印每次请求的url
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
