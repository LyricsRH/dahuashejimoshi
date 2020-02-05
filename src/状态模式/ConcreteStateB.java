package 状态模式;

public class ConcreteStateB extends State{
    @Override
    void handle(Context context) {
        System.out.println("b");
        context.setState(new ConcreteStateA());
    }
}
