package 模板模式;

public class ConcreteClass2 extends AbstractClass{
    @Override
    void updateGbest() {
        System.out.println("a");
    }

    @Override
    void updateVelocity() {
        System.out.println("b");
    }

    @Override
    void updatePosition() {
        System.out.println("c");
    }
}
