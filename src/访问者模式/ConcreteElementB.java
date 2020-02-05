package 访问者模式;

import java.util.LinkedList;
import java.util.List;

public class ConcreteElementB extends Element {


    @Override
    void accepte(Visitor visitor) {
        visitor.visitorConcreteElementB(this);
    }

    @Override
    void operation() {

    }
}
