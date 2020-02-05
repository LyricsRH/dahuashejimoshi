package 抽象工厂模式;

public class NewDBDepartment  implements  Department {
    @Override
    public void add() {
        System.out.println("newDB add Department");
    }

    @Override
    public void delete() {
        System.out.println("newDB delete Department");
    }
}
