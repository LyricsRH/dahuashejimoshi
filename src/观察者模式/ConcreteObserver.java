package 观察者模式;

import 模板模式.ConcreteClass;

public class ConcreteObserver implements Observer {
    //观测者身份
    private String name;
    //观测者状态，为了和subjectState保持一致
    private String observerState;
    //观测的是哪个subject
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject,String name){
        this.name=name;
        this.subject=subject;
    }

    @Override
    public void update() {
        observerState=subject.getSubjectState();
        System.out.println("观察者"+name+"状态为"+observerState);
    }
}
