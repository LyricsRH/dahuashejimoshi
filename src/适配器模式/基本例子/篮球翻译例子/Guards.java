package 适配器模式.基本例子.篮球翻译例子;

public class Guards extends Player{
    public Guards(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println("后卫"+name+"attack");
    }

    @Override
    void defend() {
        System.out.println("后卫"+name+"defend");
    }
}
