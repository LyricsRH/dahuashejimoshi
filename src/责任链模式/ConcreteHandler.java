package 责任链模式;

public class ConcreteHandler  extends  Handler{
    @Override
    void HandlerRequest(int request) {
       if (request<0){
           System.out.println("小于0");

       }else if (this.success!=null){
            success.HandlerRequest(request);
       }
    }
}
