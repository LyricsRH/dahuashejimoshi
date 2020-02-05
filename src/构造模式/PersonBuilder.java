package 构造模式;

//定义主要流程
public abstract class PersonBuilder {
    //一个构件人的主要流程组成单元
    //特殊需求，继承该主流程，再添加。保证主流程完整，表示可修改
    public  abstract void BuilderHead();
    public  abstract void BuilderBody();
    public  abstract void BuilderArmLeft();
    public  abstract void BuilderArmRight();
    public  abstract void BuilderLegLeft();
    public  abstract void BuilderLegRight();
}
