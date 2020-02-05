package 抽象工厂模式;

public class AccessUser implements User {
    @Override
    public void add() {
        System.out.println("access:add");
    }

    @Override
    public void delete() {
        System.out.println("access:delete");
    }
}
