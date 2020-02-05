package 责任链模式;

public class ConcreteHandler2 extends  Handler {
    @Override
    void HandlerRequest(int request) {
        if (request<10){
            //满足条件，在这里终止，不进入下一个责任
            System.out.println("<10");
        }else if (success!=null){
            //success是在client设置的责任链的下一个
            success.HandlerRequest(request);
        }
    }
}
