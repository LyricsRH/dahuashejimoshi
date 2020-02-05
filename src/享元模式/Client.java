package 享元模式;

public class Client {
    public static void main(String[] args) {
        FlyWeightFactory factory=new FlyWeightFactory();
        int num=22;
        FlyWeight a = factory.getFlyWeight("a");
        a.operation(--num);
        FlyWeight b = factory.getFlyWeight("b");
        b.operation(--num);
        UnsharedFlyWeight c=new UnsharedFlyWeight();
        c.operation(--num);
    }
}
