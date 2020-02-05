package 访问者模式;

import java.util.LinkedList;
import java.util.List;

public class ConcreteElementA extends Element{


    @Override
    void accepte(Visitor visitor) {
        visitor.visitorConcreeElementA(this);
    }

    @Override
    void operation() {

    }
}
