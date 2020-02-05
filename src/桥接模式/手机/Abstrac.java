package 桥接模式.手机;

public abstract class Abstrac {
     Phone phone;
     Soft soft;

      void Ope(){
        phone.operation();
        soft.func();
     }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setSoft(Soft soft) {
        this.soft = soft;
    }
}
