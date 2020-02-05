package 状态模式.简单例子;

public class NumContext {

    private  int num;
    private NumState state;

    public NumContext(){
        state=new ZhengState();
    }

    public void handle(){
        state.handle(this);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public NumState getState() {
        return state;
    }

    public void setState(NumState state) {
        this.state = state;
    }
}
