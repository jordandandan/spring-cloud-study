package com.xjy.model;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 路由断言模型
 *
 * @author bjxujiayi
 * @create 2019-04-09 13:54
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GatewayPredicateDefinition {
    //断言对应的Name
    private String name;
    //配置的断言规则
    private Map<String, String> args = new LinkedHashMap<>();
}
