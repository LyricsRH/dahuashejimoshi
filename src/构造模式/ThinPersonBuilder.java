package 构造模式;

public class ThinPersonBuilder extends PersonBuilder {
    @Override
    public void BuilderHead() {
        System.out.println("thin head");
    }

    @Override
    public void BuilderBody() {
        System.out.println("thin body");
    }

    @Override
    public void BuilderArmLeft() {
        System.out.println("thin armleft");
    }

    @Override
    public void BuilderArmRight() {
        System.out.println("thin armright");
    }

    @Override
    public void BuilderLegLeft() {
        System.out.println("thin legleft");
    }

    @Override
    public void BuilderLegRight() {
        System.out.println("thin legright");
    }
}
