package 组合模式;

import java.util.LinkedList;
import java.util.List;

public class ConcreteCompany extends Company{
    public ConcreteCompany(String name) {
        super(name);
    }
    List<Company> list=new LinkedList<Company>();

    @Override
    void add(Company company) {
        list.add(company);
    }

    @Override
    void remove(Company company) {
        list.remove(company);
    }

    @Override
    void show(int depth) {
        for (int i = 0; i <depth ; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Company company:list) {
           // depth=depth+2;
            company.show(depth+2);
        }
    }

    @Override
    void Duty() {
        for (Company company:list) {
            company.Duty();
        }
    }
}
