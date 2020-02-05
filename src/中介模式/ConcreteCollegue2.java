package 中介模式;

public class ConcreteCollegue2  extends Collegue{
    public ConcreteCollegue2(Mediator mediator) {
        super(mediator);
    }
    public void send(String mess){
        mediator.send(mess,this);
    }

    public void get(String mess){
        System.out.println("2号"+mess);
    }

}
