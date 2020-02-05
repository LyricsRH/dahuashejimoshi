package 状态模式.例子;

public class Morning extends States {
    @Override
    void handle(Work work) {
        if (work.getTime()<12){
            System.out.println("上午");
        }else {
           // work.setTime(work.getTime());
            work.setStates(new Noon());
            work.handle();
        }
    }
}
