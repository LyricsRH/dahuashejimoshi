package 组合模式;

public abstract class Company {

    String  name;
    public Company(String name){
        this.name=name;
    }

    abstract void add(Company company);
    abstract void remove(Company company);
    abstract void show(int depth);
    abstract void Duty();
}
