package 命令模式.基本;

public class CommandB extends  Command {
    public CommandB(Receiver receiver) {
        super(receiver);
    }

    @Override
    void command() {
        receiver.ActionB();
    }
}
