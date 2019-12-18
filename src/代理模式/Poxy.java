package 代理模式;

public class Poxy implements GiveGift {

      RealObject realObject;
    public Poxy(ScoolGirl scoolGirl){
        if (this.realObject==null){
            this.realObject=new RealObject(scoolGirl);
        }
    }

    @Override
    public void giveFlow() {
        realObject.giveFlow();
    }

    @Override
    public void giveMoney() {
        realObject.giveMoney();
    }

    @Override
    public void giveCar() {
        realObject.giveCar();
    }
}
