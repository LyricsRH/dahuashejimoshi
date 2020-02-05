package 状态模式.简单例子;

public class FuShuState extends NumState {
    @Override
    void handle(NumContext context) {
        if (context.getNum()<-10){
            System.out.println("小于-10");
        }else{
            System.out.println("小于0大于-10");
        }
    }
}
