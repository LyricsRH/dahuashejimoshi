package 工厂方法;

public class FactoryMUL implements Factory{
    @Override
    public Operation createOperation() {
        return new OperationMUL();
    }
}
