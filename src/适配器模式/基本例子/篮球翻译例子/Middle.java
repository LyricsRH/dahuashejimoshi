package 适配器模式.基本例子.篮球翻译例子;

public class Middle extends Player{
    public Middle(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println("中锋"+name+"attack");
    }

    @Override
    void defend() {
        System.out.println("中锋"+name+"defend");
    }
}
