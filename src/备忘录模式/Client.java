package 备忘录模式;

public class Client {

    public static void main(String[] args) {
        Originator originator=new Originator();
        originator.setState("aaaa");
        Memento memento = originator.createMemento();
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(memento);
        originator.show();
        originator.setState("bbbb");
        originator.show();
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
