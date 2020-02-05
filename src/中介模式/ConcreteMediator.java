package 中介模式;

public class ConcreteMediator extends Mediator {
    @Override
    void send(String mess, Collegue collegue) {
        if (collegue==c1){
            //1号发送的消息，二号接受
            c2.get(mess);
        }else{
            c1.get(mess);
        }
    }

    Collegue c1;
    Collegue c2;

}
