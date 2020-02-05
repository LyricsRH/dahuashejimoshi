package 模板模式;

public class Client {
    public static void main(String[] args) {
        AbstractClass concreteClass=new ConcreteClass();
        concreteClass.method();
        AbstractClass concreteClass1=new ConcreteClass2();
        concreteClass1.method();
    }
}
