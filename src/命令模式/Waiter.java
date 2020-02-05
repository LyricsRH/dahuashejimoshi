package 命令模式;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.LinkedList;
import java.util.List;

public class Waiter {
    //private Order order;
    //形成命令队列，便于取消，否决
    List<Order> list=new LinkedList<>();
    public void setOrder(Order order){
      //  this.order=order;
        list.add(order);
    }
    public void notigyBar(){
        for (Order order:list) {
            order.command();
        }
    }
}
