package 代理模式;

public class Client {


    public static void main(String[] args) {
        ScoolGirl scoolGirl=new ScoolGirl("nn");
      //  RealObject realObject=new RealObject(scoolGirl);
        //直接完全代理，realobject获得什么，poxy也获得什么
        Poxy poxy=new Poxy(scoolGirl);
        poxy.giveCar();
        poxy.giveFlow();
        poxy.giveMoney();
    }
}
