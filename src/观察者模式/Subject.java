package 观察者模式;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {
    List<Observer>observers =new LinkedList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for (Observer observer:observers) {
            observer.update();
        }
    }
}
