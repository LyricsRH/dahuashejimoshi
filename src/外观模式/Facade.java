package 外观模式;

//将不同的方法组合，重新展示
public class Facade {
    MethodOne methodOne;
    MethodTwo methodTwo;
    MethodThree methodThree;
    MethodFive methodFive;

    public Facade(){
        methodOne=new MethodOne();
        methodTwo=new MethodTwo();
        methodThree=new MethodThree();
        methodFive=new MethodFive();
    }

    public void methodA(){
        methodOne.one();
        methodThree.three();
    }

    public void methodB(){
        methodThree.three();
        methodOne.one();
        methodTwo.two();
        methodFive.five();
    }
}
