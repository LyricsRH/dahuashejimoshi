package 组合模式;

public class Money extends Company{

    public Money(String name) {
        super(name);
    }

    @Override
    void add(Company company) {

    }

    @Override
    void remove(Company company) {

    }

    @Override
    void show(int depth) {
        for (int i = 0; i <depth ; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    void Duty() {
        System.out.println(name+"财务管理");
    }
}
