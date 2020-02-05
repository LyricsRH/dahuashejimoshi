package 抽象工厂模式;

public class Client {
    public static void main(String[] args) {
        Factory factory=new SqlFactory();
        User user = factory.createUser();
        Department department=factory.createDepartment();
        department.add();
        department.delete();
        user.add();
        user.delete();

        //
        Factory factory1=new AccessFactory();
        User user1 = factory1.createUser();
        user1.add();
        //
        //新添加一种数据库
        Factory newFactory=new NewDBFactory();
        User user2 = newFactory.createUser();
        Department department1=newFactory.createDepartment();
        user2.add();
        department1.add();

    }
}
