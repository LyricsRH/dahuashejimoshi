package 状态模式;

public class ConcreteStateA extends State {

    @Override
    void handle(Context context) {
        System.out.println("a");
        context.setState(new ConcreteStateB());
    }
}
