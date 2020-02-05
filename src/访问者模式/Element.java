package 访问者模式;

import java.util.List;

public abstract class Element {
    abstract void accepte(Visitor visitor);
    abstract  void operation();
}
