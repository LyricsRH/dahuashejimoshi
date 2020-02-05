package 中介模式;

public abstract class Collegue {

    Mediator mediator;
    public Collegue(Mediator mediator){
        this.mediator=mediator;
    }

    abstract void send(String mess);
    abstract void get(String mess);

}
