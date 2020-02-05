package 桥接模式;

public class Client {
    public static void main(String[] args) {
        Phone p=new PhoneA();
        p.setSoft(new SoftA());
        p.operation();
        //添加添加功能
        //手机不用变，，老的继承方式，1,第一层按品牌，新增了功能，每个品牌下面都要加一个新功能的子类
        //2，第一层按功能，需要在第一层加一个节点，并在该节点下加所有的品牌子节点
        //桥接模式直接加一个功能子类，用set设置即可
        Phone phone=new PhoneA();
        phone.setSoft(new SoftA());
        phone.operation();
        phone.setSoft(new SoftB());
        phone.operation();
        //添加手机同样的道理
    }
}
