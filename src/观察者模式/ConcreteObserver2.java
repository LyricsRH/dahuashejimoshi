package 观察者模式;

public class ConcreteObserver2 implements Observer {

    String state;
     ConcreteSubject subject;
    public ConcreteObserver2(ConcreteSubject subject){
        this.subject=subject;
    }

    @Override
    public void update() {
        this.state=subject.getSubjectState();
        System.out.println("观察者2号"+state);
    }
}
