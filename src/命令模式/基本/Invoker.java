package 命令模式.基本;

public class Invoker {

    Command command;
    void setCommand(Command command){
        this.command=command;
    }
    void tell(){
        command.command();
    }
}
