package 享元模式.example1;

public class Client {
    public static void main(String[] args) {
        WebsiteFactory factory=new WebsiteFactory();
        System.out.println(factory.getWebCount());
        Website movie = factory.getWebsite("电影");
        //user是外部状态，不共享，由客户端创建并传入
        movie.use(new User("a"));
        Website movie2 = factory.getWebsite("电影");
        movie2.use(new User("c"));
        Website movie3 = factory.getWebsite("电影");
        movie3.use(new User("b"));
        System.out.println(factory.getWebCount());

        String a="a";
        String b="a";
        System.out.println(a==b);
    }
}
