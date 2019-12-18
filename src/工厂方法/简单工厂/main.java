package 工厂方法.简单工厂;

import 工厂方法.Operation;

public class main {

    public static void main(String[] args) {
        int a=2;int b=3;
        Operation operation=SimpleFactory.createFactory("-");
        System.out.println( operation.getResult(1,2));
        System.out.println( operation.getResult(3,4));
    }
}
