package 享元模式.example1;

public class ConcreteWebsite extends Website {

    String name;
    public ConcreteWebsite(String name){
        this.name=name;
    }

    @Override
    void use(User user) {
        System.out.println("网站分类"+name+"用户"+user.name);
    }
}
