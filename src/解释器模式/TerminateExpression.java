package 解释器模式;

public class TerminateExpression extends AbstractExpression {
    @Override
    void expression(ExpressContext context) {
        System.out.println("中断");
    }
}
