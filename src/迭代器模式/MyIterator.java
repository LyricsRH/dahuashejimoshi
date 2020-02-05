package 迭代器模式;

public abstract class MyIterator {

    abstract Object first();
    abstract Object next();
    abstract boolean isFinish();
    abstract Object currentObjct();
}
