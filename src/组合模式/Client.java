package 组合模式;

public class Client {
    public static void main(String[] args) {
        Company rootCompany=new ConcreteCompany("总公司");

        Company moneyCompany=new Money("总部财务");
        Company peoCompany=new People("总部人力");
        rootCompany.add(moneyCompany);
        rootCompany.add(peoCompany);

        Company conComponey=new ConcreteCompany("华南分公司");
        Company moneyCompany2=new Money("华南财务");
        Company peoCompany2=new People("华南人力");
        rootCompany.add(conComponey);
        conComponey.add(moneyCompany2);
        conComponey.add(peoCompany2);

        Company conComponey2=new ConcreteCompany("江苏公司");
        Company moneyCompany3=new Money("江苏财务");
        Company peoCompany3=new People("江苏人力");
        conComponey.add(conComponey2);
        conComponey2.add(moneyCompany3);
        conComponey2.add(peoCompany3);

        rootCompany.show(1);
        rootCompany.Duty();
    }
}
