package 抽象工厂模式;

public class NewDBFactory implements Factory {
    @Override
    public User createUser() {
        return new NewDBUser();
    }

    @Override
    public Department createDepartment() {
        return new NewDBDepartment();
    }
}
