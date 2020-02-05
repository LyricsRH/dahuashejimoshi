package 抽象工厂模式.反射抽象工厂;

import 抽象工厂模式.Department;
import 抽象工厂模式.User;

public class Factory {

    public static User createUser(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (User) Class.forName(name).newInstance();
    }

    public static Department createDepartment(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Department) Class.forName(name).newInstance();
    }
}
