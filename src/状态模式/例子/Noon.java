package 状态模式.例子;

public class Noon extends States {
    @Override
    void handle(Work work) {
        if (work.getTime()<14){
            System.out.println("中午"+work.getTime());
        }else{
            work.setStates(new Afternonn());
            work.handle();
        }
    }
}
