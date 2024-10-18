package com.lilong.design.behavioral.interpreter;

/**
 * @author : lilong
 * @date : 2024-10-18 22:37
 * @description : 解释器
 */
public abstract class IDCardExpression {
    /**
     * 解释器
     * @param expression
     */
    abstract public Boolean interpreter(String expression);
}
