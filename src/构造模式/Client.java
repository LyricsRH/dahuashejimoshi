package 构造模式;

//把复杂对象的构建和他的表示，分开，  构建过程是一定的，，通过类型相同过程获得不同对象
public class Client {
    public static void main(String[] args) {
        PersonDirector personDirector=new PersonDirector(new ThinPersonBuilder());
        personDirector.createPerson();
    }
}
