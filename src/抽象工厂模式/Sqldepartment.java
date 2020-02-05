package 抽象工厂模式;

public class Sqldepartment implements Department {
    @Override
    public void add() {
        System.out.println("sql:add:department");
    }

    @Override
    public void delete() {
        System.out.println("sql:delete:deparmetn");
    }
}
