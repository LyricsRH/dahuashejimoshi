package 桥接模式;

public class PhoneA extends Phone {
    @Override
    void operation() {
        System.out.println("PhoneA");
        this.soft.function();
    }
}
