package 适配器模式.基本例子.篮球翻译例子;

public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println("前锋"+name+"attack");
    }

    @Override
    void defend() {
        System.out.println("前锋"+name+"defend");
    }
}
