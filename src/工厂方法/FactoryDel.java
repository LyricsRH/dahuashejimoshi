package 工厂方法;

import 工厂方法.简单工厂.OperationDel;

public class FactoryDel implements Factory{
    @Override
    public Operation createOperation() {
        return new OperationDel();
    }
}
