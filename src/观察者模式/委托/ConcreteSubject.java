package 观察者模式.委托;



public class ConcreteSubject implements Subject {
    //声明一个委托
    //public event EventHandler update;
    //java没有委托，可以利用反射实现
    @Override
    public void notifyObserver() {

    }
}
