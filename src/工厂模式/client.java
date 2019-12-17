package 工厂模式;

public class client {

    public static void main(String[] args) {
        int b=4;
        int a=3;
        Context context=new Context("*");
        System.out.println(context.GetResult(a,b));
    }
}
