package 装饰者模式;

class DecoratorCloth  extends Person{
    public Person person;

    public void Decorate(Person person){
        this.person=person;
    };

    @Override
    public void show() {
        person.show();
    }
}

class Tshirt extends DecoratorCloth{
    @Override
    public void show() {
        System.out.print("T-Shirt#");
        super.show();
    }
}

class Pants extends DecoratorCloth{
    @Override
    public void show() {
        System.out.print("Pants#");
        super.show();
    }
}

class shoes extends DecoratorCloth{

    @Override
    public void show() {
        //T3的show
        System.out.print("shoes#");
        //t3装饰了t2 t3.decorator(t2) ,t2.show，。。。,DecoratorCloth.show是最终被装饰的person的show
        super.show();
    }
}
