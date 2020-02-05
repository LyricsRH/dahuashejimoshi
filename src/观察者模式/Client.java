package 观察者模式;

public class Client  {
    public static void main(String[] args) {
        //subject其实就维护了一个观察者队列，一个通知方法，具体类有个状态
        ConcreteSubject s=new ConcreteSubject();
        s.addObserver(new ConcreteObserver(s,"aa"));
        s.addObserver(new ConcreteObserver(s,"bb"));
        s.addObserver(new ConcreteObserver(s,"cc"));
        s.addObserver(new ConcreteObserver2(s));
        //不同的观察者，只要实现了update方法，在notify统一通知的update
        s.setSubjectState("ABC");
        s.notifyObserver();
    }
}
