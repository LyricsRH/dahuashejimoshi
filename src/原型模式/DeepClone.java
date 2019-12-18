package 原型模式;

public class DeepClone extends Resume {
    public DeepClone(int id) {
        super(id);
    }

    @Override
    public Resume clones() throws CloneNotSupportedException {
        Resume resume = (Resume) this.clone();
       // resume.setPerson(new Person("kk"));
        resume.setPerson((Person) resume.getPerson().clones());
        return resume;
    }
}
