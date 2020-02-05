package 状态模式.例子;

public class Work {
    private double time;
    private boolean finish;

    //state是保证调用哪个条件对象，，，，，time和finish是做条件分支判断的
    private States states;

    public Work(){
        states=new Morning();
    }

    public void handle(){
        states.handle(this);
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public States getStates() {
        return states;
    }

    public void setStates(States states) {
        this.states = states;
    }
}
