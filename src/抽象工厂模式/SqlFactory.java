package 抽象工厂模式;

public class SqlFactory implements Factory{
    @Override
    public User createUser() {
        User user=new SqlUser();
        return  user;
    }

    @Override
    public Department createDepartment() {
        Department department=new Sqldepartment();
        return  department;
    }
}
