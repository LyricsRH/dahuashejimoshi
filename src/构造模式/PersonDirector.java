package 构造模式;

//builder中声明的是流程的组成单元，形成过程，流程需要组合在一起，需要一个指挥者。
public class PersonDirector {
    private PersonBuilder pb;
    public PersonDirector(PersonBuilder pb){
        this.pb=pb;
    }
    //组合
    //相当于在builder中定义了updatePositon,updateBest()这种方法，在这里把他们集合起来形成算法，不同bulder继承者可以实现不同的算子

    public void createPerson(){
        pb.BuilderHead();
        pb.BuilderBody();
        pb.BuilderArmLeft();
        pb.BuilderArmRight();
        pb.BuilderLegLeft();
        pb.BuilderLegRight();
    }
}
