package 状态模式.例子;

public class Client {
    public static void main(String[] args) {
        Work work=new Work();
        work.setTime(13);
        work.handle();
        work.setTime(10);
        work.handle();
        work.setTime(18);
        work.handle();
    }
}
