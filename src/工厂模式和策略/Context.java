package 工厂模式和策略;

public class Context {
    Operation operation=null;
    public Context(String s){
        switch (s){
            case "+": operation=new OperationADD();break;
            default:operation=new OperationMul();break;
        }
    }
    public int GetResult(int a,int b){
        //具体算法与客户端隔离
        return operation.result(a,b);
    }
}
