package 抽象工厂模式;

public class SqlUser implements User{
    @Override
    public void add() {
        System.out.println("sql:add");
    }

    @Override
    public void delete() {
        System.out.println("sql:delete");
    }
}
