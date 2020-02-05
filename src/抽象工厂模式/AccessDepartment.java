package 抽象工厂模式;

public class AccessDepartment implements Department{
    @Override
    public void add() {
        System.out.println("depart:Access:add");
    }

    @Override
    public void delete() {
        System.out.println("depart:Access:delete");
    }
}
