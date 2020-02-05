package 观察者模式.委托;

public interface Subject {
    //观察者没有相同update方法，增加和删除没有必要维护了
     void notifyObserver();
     //String subjectState = null;
}
