package 适配器模式.基本例子;

//适配器继承目标
//在适配器里面装一个被是陪对象，转换成需要的方法
public class Adapter  extends Target {

    Adaptee adaptee=new Adaptee();

    @Override
    void targetMethod() {
        adaptee.SpecialRequest();
    }
}
