package 桥接模式.手机;

public class RefinedAbstrac extends  Abstrac {
    @Override
    void Ope() {
        soft.func();
        phone.operation();
       // soft.func();
    }
}
