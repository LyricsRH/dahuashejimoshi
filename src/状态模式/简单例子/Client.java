package 状态模式.简单例子;

public class Client {
    public static void main(String[] args) {
        NumContext numContext=new NumContext();
        numContext.setNum(-14);
        numContext.handle();
        numContext.setNum(3);
        numContext.handle();
        //一个对象只能判断一次，因为ifelse判断如果过了条件不能再回去
    }
}
