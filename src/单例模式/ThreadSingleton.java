package 单例模式;

public class ThreadSingleton {
    private static ThreadSingleton instance;
    private static Object object;
    private ThreadSingleton(){}
    public ThreadSingleton getInstance(){

        synchronized (object){
            if (instance==null) instance=new ThreadSingleton();
        }
        return instance;
    }

    public ThreadSingleton getInstance2(){
        if (instance==null) {
            synchronized (object) {
                //说明前面拿到锁的也没有建对象/
                if (instance==null)
                instance=new ThreadSingleton();
            }
        }
        return instance;
    }
}
