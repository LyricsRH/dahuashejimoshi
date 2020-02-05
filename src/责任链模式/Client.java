package 责任链模式;

public class Client {
    public static void main(String[] args) {
        //构建责任链
        Handler handler1=new ConcreteHandler();
        Handler handler2=new ConcreteHandler2();
        Handler handler3=new ConcreteHandler3();
        handler1.setSuccess(handler2);
        handler2.setSuccess(handler3);

        handler1.HandlerRequest(12);
    }
}
