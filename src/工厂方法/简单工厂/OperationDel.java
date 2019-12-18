package 工厂方法.简单工厂;

import 工厂方法.Operation;

public class OperationDel implements Operation{
    @Override
    public int getResult(int a, int b) {
        return a-b;
    }
}
