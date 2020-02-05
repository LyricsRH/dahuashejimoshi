package 中介模式.联合国例子;

public class England extends Country{
    public England(中介模式.联合国例子.lianheguo lianheguo) {
        super(lianheguo);
    }

    @Override
    void send(String mess) {
        lianheguo.send(mess,this);
    }

    @Override
    void get(String mess) {
        System.out.println("this is England"+mess);
    }
}
