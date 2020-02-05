package 适配器模式.基本例子.篮球翻译例子;

public class Client {
    public static void main(String[] args) {
        Player forward=new Forwards("lal");
      //  Player middle=new Middle("mid");
        Player middle=new MiddleTranslator("姚明");
       //想利用ForeignMiddle方法，但是都是Player的子类，用适配器，转换ForeignMiddle
        Player guard=new Guards("back");
        forward.attack();
        middle.defend();
        middle.attack();
        guard.attack();
    }
}
