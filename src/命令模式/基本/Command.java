package 命令模式.基本;

public abstract class Command {
    Receiver receiver;
    public Command(Receiver receiver){
        this.receiver=receiver;
    }

    abstract void command();
}
