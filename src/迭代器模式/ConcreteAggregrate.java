package 迭代器模式;

import java.util.LinkedList;
import java.util.List;

public class ConcreteAggregrate extends MyAggregate {
    @Override
    MyIterator createIterator() {
        return new ConcreteIterator(this);
    }

    List<Object> list =new LinkedList<>();
    public Object getIndex(int i){
        return list.get(i);
    }
    public int getCount(){
        return  list.size();
    }
}
