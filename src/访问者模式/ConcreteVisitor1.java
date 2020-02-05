package 访问者模式;

public class ConcreteVisitor1 extends Visitor{

    @Override
    void visitorConcreeElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getName()+"被访问"+this.getClass().getName());
    }

    @Override
    void visitorConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getName()+"被访问"+this.getClass().getName());

    }
}


