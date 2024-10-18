package com.lilong.design.behavioral.interpreter;

/**
 * @author : lilong
 * @date : 2024-10-18 22:45
 * @description :
 */
public class OrExpression extends IDCardExpression{

    private TerminalExpression terminalExpression;
    private TerminalExpression type;
    public OrExpression(TerminalExpression terminalExpression,TerminalExpression type){
        this.terminalExpression=terminalExpression;
        this.type=type;
    }

    /**
     * 最终版计算
     * @param expression
     * @return
     */
    @Override
    public Boolean interpreter(String expression) {
        return terminalExpression.interpreter(expression) || type.interpreter(expression);
    }
}
