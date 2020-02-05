package 解释器模式;

public class NonTerminateExpression extends  AbstractExpression {
    @Override
    void expression(ExpressContext context) {
        System.out.println("非中断");
    }
}
