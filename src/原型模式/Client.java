package 原型模式;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
      //  Resume resume=new SurfaceClone(1);
      //  Resume resume1=resume.clones();

       // resume1.setId(2);
        //System.out.println(resume1.getId());
        //System.out.println(resume.getId());

      //  resume.getPerson().setName("ss");
      //  resume1.getPerson().setName("gg");
      //  System.out.println(resume.getPerson().getName());
      //  System.out.println(resume1.getPerson().getName());
        //浅层克隆调用默认clone，只有基本类型是自己的，对象等克隆的是引用

        Resume resume=new DeepClone(2);
        Resume resume1=resume.clones();
       //
        System.out.print(resume1.getPerson().getName());
        System.out.print(resume.getPerson().getName());
        resume1.getPerson().setName("ll");
        System.out.print(resume1.getPerson().getName());
        //深层clone,直接重新创建克隆对象，并且重新赋值（新建的对象）
        //需要被克隆的抽象类或者模板中要impletes Cloneable 才能用clone方法。
    }
}

