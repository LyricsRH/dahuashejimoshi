package 代理模式;

public class RealObject implements GiveGift {

    ScoolGirl scoolGirl;
    public RealObject(ScoolGirl scoolGirl){
        this.scoolGirl=scoolGirl;
    }

    @Override
    public void giveFlow() {
        System.out.print(scoolGirl.name+"flower$");
    }

    @Override
    public void giveMoney() {
        System.out.print(scoolGirl.name+"money#");
    }

    @Override
    public void giveCar() {
        System.out.print(scoolGirl.name+"Car#");
    }
}
