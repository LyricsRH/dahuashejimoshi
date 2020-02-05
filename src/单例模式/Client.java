package 单例模式;

public class Client {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        System.out.println(singleton==singleton2);

        Ehanshi e=Ehanshi.getInstance();
        Ehanshi e2=Ehanshi.getInstance();
        System.out.println(e==e2);
    }
}
