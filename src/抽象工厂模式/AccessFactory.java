package 抽象工厂模式;

public class AccessFactory implements Factory{
    @Override
    public User createUser() {
        return new AccessUser();
    }

    @Override
    public Department createDepartment() {
        return new AccessDepartment();
    }
}
