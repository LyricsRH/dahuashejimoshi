package 模板模式;

public abstract class AbstractClass {

    abstract void updateGbest();
    abstract void updateVelocity();
    abstract void updatePosition();


    public void method(){
        System.out.println("start");
        System.out.println("initParticle");
        System.out.println("update result:");
        updateGbest();
        System.out.println("update Velocity");
        updateVelocity();
        System.out.println("update Position");
        updatePosition();
    }

}
