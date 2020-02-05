package 中介模式;

import 责任链模式.ConcreteHandler;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator=new ConcreteMediator();
        //把中介介绍给每个对象
        Collegue collegue1=new ConcreteCollegue1(mediator);
        Collegue collegue2=new ConcreteCollegue2(mediator);
        //为中介设置各方对象
        mediator.c1=collegue1;
        mediator.c2=collegue2;
        collegue1.send("我是1号");
        collegue2.send("我是2号");
    }
}
