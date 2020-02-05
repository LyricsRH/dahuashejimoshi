package 责任链模式;

public abstract class Handler {

     Handler success=null;
    public void setSuccess(Handler success){
        this.success=success;
    }

    //请求处理方法
    abstract void HandlerRequest(int request);
}
