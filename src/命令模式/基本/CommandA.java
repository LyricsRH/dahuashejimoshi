package 命令模式.基本;

public class CommandA extends  Command {
    public CommandA(Receiver receiver) {
        super(receiver);
    }

    @Override
    void command() {
        receiver.ActionA();
    }
}
