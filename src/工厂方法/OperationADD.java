package 工厂方法;

public class OperationADD implements Operation {



    @Override
    public int getResult(int a, int b) {
        return a+b;
    }
}
