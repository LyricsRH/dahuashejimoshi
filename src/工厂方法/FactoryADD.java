package 工厂方法;

public class FactoryADD implements Factory {
    @Override
    public Operation createOperation() {
        return  new OperationADD();
    }
}
