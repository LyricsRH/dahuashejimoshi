package 模板模式;

public class ConcreteClass extends  AbstractClass {
    @Override
    void updateGbest() {
        System.out.println("gbest ok");
    }

    @Override
    void updateVelocity() {
        System.out.println("velocity not ok");
    }

    @Override
    void updatePosition() {
        System.out.println("position is ready");
    }
}
