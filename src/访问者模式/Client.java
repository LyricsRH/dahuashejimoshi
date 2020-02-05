package 访问者模式;

public class Client {
    public static void main(String[] args) {
        //先把数据结构搭建起来
        OjectStructure o=new OjectStructure();
        ConcreteElementA concreteElementA=new ConcreteElementA();
        ConcreteElementB concreteElementB=new ConcreteElementB();
        o.add(concreteElementA);
        o.add(concreteElementB);

        ConcreteVisitor1 visitor1=new ConcreteVisitor1();
        ConcreteVisitor2 visitor2=new ConcreteVisitor2();
        //新添加的方法3
        ConcreteVisitor3 visitor3=new ConcreteVisitor3();
        //接受一个visitor然后对所有element进行更新
        //新添加的方法写在visitor里面，visitor是对element部分变量方法进行更新，需要把element传入Visitor方法中
        //而在element方法中调用visitor的方法，就实现了把visitor方法加入到了element内部。
        //因为abstract Elemnent 为传入visiior ,调用visirotr新方法预留了abstract方法
        o.accept(visitor1);
        o.accept(visitor2);
        o.accept(visitor3);
    }
}
