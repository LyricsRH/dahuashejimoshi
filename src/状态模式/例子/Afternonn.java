package 状态模式.例子;

public class Afternonn extends  States {
    @Override
    void handle(Work work) {
        if (work.getTime()<17){
            System.out.println("下午"+work.getTime());
        }else{
            work.setStates(new Evening());
            work.handle();
        }
    }
}
