package 责任链模式;

public class ConcreteHandler3  extends Handler{
    @Override
    void HandlerRequest(int request) {
        System.out.println("最后，>10");
    }
}
