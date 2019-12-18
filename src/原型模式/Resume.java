package 原型模式;

abstract class Resume implements Cloneable {
    public void setId(int id) {
        this.id = id;
    }

    private  int id;
    private Person person=new Person("ss");
    public Resume(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public abstract Resume clones() throws CloneNotSupportedException;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
