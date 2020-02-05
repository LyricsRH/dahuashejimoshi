package 备忘录模式;

public class Originator {
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;

    //新建备忘录
    public Memento createMemento(){
        return  new Memento(this.state);
    }
    //恢复备忘录
    public void setMemento(Memento memento){
        this.state=memento.getState();
    }

    public void show(){
        System.out.println("state="+state);
    }
}
