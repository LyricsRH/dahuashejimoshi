package 观察者模式;

public class ConcreteSubject extends Subject {

    //subject的具体实现，添加一个state，当state发生改变后，通知
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
