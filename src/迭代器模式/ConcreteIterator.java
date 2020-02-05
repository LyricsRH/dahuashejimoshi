package 迭代器模式;

public class ConcreteIterator extends  MyIterator {

    public ConcreteAggregrate aggregate;
    int count=0;
    public ConcreteIterator(ConcreteAggregrate aggregate){this.aggregate=aggregate;}


    @Override
    Object first() {
        return aggregate.getIndex(0);
    }

    @Override
    Object next() {
        count++;
        Object o=null;
        if (count<aggregate.getCount()) o=aggregate.getIndex(count);
        return  o;
    }

    @Override
    boolean isFinish() {
        return count>=aggregate.getCount();
    }

    @Override
    Object currentObjct() {
        return aggregate.getIndex(count);
    }
}
