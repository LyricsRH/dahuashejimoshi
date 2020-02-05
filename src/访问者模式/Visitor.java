package 访问者模式;

public abstract class Visitor {
    //一个操作，为所有的concreteElement都添加，因此数据结构要稳定，可以添加Visitor子类，添加新操作
    abstract void visitorConcreeElementA(ConcreteElementA concreteElementA);
    abstract  void visitorConcreteElementB(ConcreteElementB concreteElementB);
}
