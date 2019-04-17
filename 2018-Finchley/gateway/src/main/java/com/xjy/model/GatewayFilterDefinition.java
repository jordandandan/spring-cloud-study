package com.xjy.model;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 过滤器模型
 *
 * @author bjxujiayi
 * @create 2019-04-09 13:57
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GatewayFilterDefinition {
    //Filter Name
    private String name;
    //对应的路由规则
    private Map<String, String> args = new LinkedHashMap<>();
}
