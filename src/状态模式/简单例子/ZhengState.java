package 状态模式.简单例子;

public class ZhengState extends NumState{
    @Override
    void handle(NumContext context) {
        if (context.getNum()>0){
            System.out.println("正数");
        }else{
            context.setState(new FuShuState());
            context.handle();
        }
    }
}
