package 工厂方法.简单工厂;

import 工厂方法.Operation;
import 工厂方法.OperationADD;
import 工厂方法.OperationMUL;

public class SimpleFactory {

    public static Operation createFactory(String name){
        Operation operation=null;
        switch (name){
            case "+": operation =new OperationADD();
            break;
            case "*":operation=new OperationMUL(); break;
            case "-":operation=new OperationDel(); break;
        }
        return  operation;
    }
}
