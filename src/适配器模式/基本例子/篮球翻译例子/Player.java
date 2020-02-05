package 适配器模式.基本例子.篮球翻译例子;

public abstract class Player {
    protected String name;
    public Player(String name){
        this.name=name;
    }
    abstract void attack();
    abstract void defend();
}
