package 中介模式;

public class ConcreteCollegue1 extends Collegue{

    public ConcreteCollegue1(Mediator mediator) {
        super(mediator);
    }

    public void send(String mess){
        mediator.send(mess,this);
    }

    public void get(String mess){
        System.out.println("1号"+mess);
    }
}
