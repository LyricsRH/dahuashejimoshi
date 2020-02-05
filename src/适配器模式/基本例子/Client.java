package 适配器模式.基本例子;

public class Client {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.targetMethod();
    }
}
