package 命令模式;

public class Client {
    public static void main(String[] args) {
        Waiter waiter=new Waiter();
        Barbecuer barbecuer=new Barbecuer();
        waiter.setOrder(new ChickenOrder(barbecuer));
     //   waiter.notigyBar();
        waiter.setOrder(new MuttonOrder(barbecuer));
        waiter.notigyBar();

    }
}
