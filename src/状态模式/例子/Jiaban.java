package 状态模式.例子;

public class Jiaban extends States {
    @Override
    void handle(Work work) {
        System.out.println("加班");
    }
}
