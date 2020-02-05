package 享元模式;

public class ConcreteFlyWeight extends FlyWeight{
    @Override
    void operation(int num) {
       System.out.println("具体的flyweight"+num);
    }
}
