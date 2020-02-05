package 解释器模式;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        ExpressContext context=new ExpressContext();
        List<AbstractExpression> list=new LinkedList<>();
        list.add(new TerminateExpression());
        list.add(new NonTerminateExpression());
        list.add(new TerminateExpression());

        for (AbstractExpression abstractExpression:list){
            abstractExpression.expression(context);
        }
    }
}


