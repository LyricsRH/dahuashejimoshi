package 中介模式.联合国例子;

public abstract  class Country {
    //向中介法消息和从中介收到消息
    abstract void send(String mess);
    abstract void get(String mess);
    //设置中介
    lianheguo lianheguo;
    public Country(lianheguo lianheguo){
        this.lianheguo=lianheguo;
    }
}
