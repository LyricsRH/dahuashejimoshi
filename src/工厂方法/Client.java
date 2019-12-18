package 工厂方法;

public class Client {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        Factory factory=new FactoryDel();
        //因为是Factory接口，因此不同工厂方法都一样
        Operation operation = factory.createOperation();
        System.out.println(operation.getResult(2,3));
        System.out.println(operation.getResult(3,4));
        System.out.println(operation.getResult(4,5));

    }
}
