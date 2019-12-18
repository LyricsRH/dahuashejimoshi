package 装饰者模式;

public class Client {

    public static void main(String[] args) {
        Person person=new Person();
        person.name="ss";
        DecoratorCloth d1=new Tshirt();
        DecoratorCloth d2=new Pants();
        DecoratorCloth d3=new shoes();
        d1.Decorate(person);
        d2.Decorate(d1);
        d3.Decorate(d2);
        d3.show();
    }
}
