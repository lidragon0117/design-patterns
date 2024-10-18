package com.lilong.design.behavioral.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : lilong
 * @date : 2024-10-18 22:39
 * @description :
 */
public class Area {
    Set<String> city = new HashSet<>();
    Set<String> type = new HashSet<>();
    IDCardExpression idCardReader;//读卡器，表达式解析器

    //环境类持有表达式

    public Area(){
        city.add("武汉市");
        city.add("上海市");

        type.add("医生");
//        type.add("老人");
        type.add("儿童");
        //最小解析
        TerminalExpression city =
                new TerminalExpression(this.city, ":");
        //最小解析
        TerminalExpression type =
                new TerminalExpression(this.type, "-");


        //以上满足一个即可
        idCardReader = new OrExpression(city,type);
    }


    void getTicket(String expression){
        Boolean interpreter = idCardReader.interpreter(expression);
        if(interpreter){
            System.out.println("免门票。。。。");
        }else{
            System.out.println("去买票....");
        }
    }
}
