package 抽象工厂模式;

public class NewDBUser implements User {
    @Override
    public void add() {
        System.out.println("new Database add user");
    }

    @Override
    public void delete() {
        System.out.println("new Database delete user");
    }
}
