package 中介模式.联合国例子;

public class Client {
    public static void main(String[] args) {
        ConcreteLianheguo lianheguo=new ConcreteLianheguo();
        Americam americam=new Americam(lianheguo);
        England england=new England(lianheguo);
        lianheguo.americam=americam;
        lianheguo.england=england;

        americam.send("我是American");
        england.send("我是England");
    }
}
