package 原型模式;

public class Person implements Cloneable{
    private String  name;

    public Person(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    protected Object clones() throws CloneNotSupportedException {
        return this.clone();
    }
}
