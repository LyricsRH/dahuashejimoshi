package 命令模式;

public class MuttonOrder extends Order {

    public MuttonOrder(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    void command() {
        barbecuer.bakeMutton();
    }
}
