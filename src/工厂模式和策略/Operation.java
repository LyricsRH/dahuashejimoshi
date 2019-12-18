package 工厂模式和策略;

public class Operation {
    //这里就属于策略模式。不同策略通过Operation封装，
    public int result(int a,int b){return -1;}
}

class OperationADD extends Operation{

    @Override
    public int result(int a, int b) {
        return a+b;
    }
}

class OperationMul extends Operation{

    @Override
    public int result(int a, int b) {
        return a*b;
    }
}
