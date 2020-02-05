package 命令模式;

import com.sun.org.apache.xpath.internal.operations.Or;

public class ChickenOrder  extends Order{
    public ChickenOrder(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    void command() {
        barbecuer.bakeChickenWing();
    }
}
