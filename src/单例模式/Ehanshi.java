package 单例模式;

public class Ehanshi {
    private static final Ehanshi e=new Ehanshi();
    private Ehanshi(){};
    public static Ehanshi getInstance(){
        return e;
    }
}
