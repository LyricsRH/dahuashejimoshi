package 状态模式.例子;

public class Evening extends States {
    @Override
    void handle(Work work) {
        if (work.isFinish()){
            System.out.println("晚上，完成下班");
        }else{
            work.setStates(new Jiaban());
            work.handle();
        }
    }
}
