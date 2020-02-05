package 访问者模式;

import java.util.LinkedList;
import java.util.List;

public class OjectStructure {
    private List<Element> list=new LinkedList<>();
    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }

    public void accept(Visitor visitor){
        for (Element element:list) {
            element.accepte(visitor);
        }
    }
}
