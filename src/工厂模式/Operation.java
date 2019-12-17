package 工厂模式;

public class Operation {
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
