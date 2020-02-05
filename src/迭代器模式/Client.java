package 迭代器模式;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregrate concreteAggregrate=new ConcreteAggregrate();
        List<Object> list=new LinkedList<>();
        list.add(1);
        list.add("a");
        list.add(3);
        list.add(4);
        concreteAggregrate.list=list;
        MyIterator iterator = concreteAggregrate.createIterator();
        System.out.println(iterator.first());
        while(!iterator.isFinish()){
            System.out.println(iterator.currentObjct());
            iterator.next();
        }
    }
}
