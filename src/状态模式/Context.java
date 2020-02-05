package 状态模式;

public class Context {

    private State state;

    public void request(){

        //通过传入不同context可以调用不同的handlef方法
        state.handle(this);
    }

    public Context(State state){
        this.state=state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
