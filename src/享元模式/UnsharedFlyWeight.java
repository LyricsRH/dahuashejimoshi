package 享元模式;

public class UnsharedFlyWeight extends FlyWeight {
    @Override
    void operation(int num) {
        System.out.println("不共享的flyweight"+num);
    }
}
