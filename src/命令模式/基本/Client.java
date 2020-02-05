package 命令模式.基本;

public class Client {
    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Invoker invoker=new Invoker();
        invoker.setCommand(new CommandA(receiver));
        invoker.setCommand(new CommandB(receiver));
        invoker.tell();
    }
}
