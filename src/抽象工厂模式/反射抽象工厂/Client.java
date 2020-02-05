package 抽象工厂模式.反射抽象工厂;

import 抽象工厂模式.User;

public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        User user = Factory.createUser("抽象工厂模式.SqlUser");
        User user2 = Factory.createUser("抽象工厂模式.NewDBUser");


        user2.add();

    }
}
