package 工厂模式;

public class Context {
    Operation operation=null;
    public Context(String s){
        switch (s){
            case "+": operation=new OperationADD();break;
            default:operation=new OperationMul();break;
        }
    }
    public int GetResult(int a,int b){
        return operation.result(a,b);
    }
}
