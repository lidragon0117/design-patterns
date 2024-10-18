package com.lilong.design.behavioral.interpreter;

import java.util.Set;

/**
 * @author : lilong
 * @date : 2024-10-18 22:40
 * @description : 表达式解析
 */
public class TerminalExpression extends IDCardExpression {
    private Set<String>  expression;
    private String type;

    public TerminalExpression(Set<String> expression, String type){
        this.expression = expression;
        this.type=type;
    }

    @Override
    public Boolean interpreter(String expression) {
        String[] split = expression.split(type);
        for (String exp : split) {
            if(expression.contains(exp)){
                return true;
            }
        }
        return false;
    }

}
