package 桥接模式.手机;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        RefinedAbstrac refinedAbstrac=new RefinedAbstrac();
        refinedAbstrac.setPhone(new PhoneA());
        refinedAbstrac.setSoft(new SoftB());
        refinedAbstrac.Ope();
        HashMap
    }
}
