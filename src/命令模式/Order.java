package 命令模式;

import com.sun.org.apache.xpath.internal.operations.Or;

public abstract class Order {
     abstract void command();
    protected  Barbecuer barbecuer;
    public Order(Barbecuer barbecuer){
        this.barbecuer=barbecuer;
    }
}
