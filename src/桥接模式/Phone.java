package 桥接模式;

public abstract class Phone {

     Soft soft;
     void setSoft(Soft soft){
        this.soft=soft;
     }
     abstract void operation();
 }
