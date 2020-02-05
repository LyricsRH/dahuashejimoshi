import java.util.concurrent.atomic.AtomicInteger;

public class CAS_ABAdemo {

    public static void main(String[] args) throws InterruptedException {
        final AtomicInteger atomicInteger = new AtomicInteger(1);

        Thread coreThread=new Thread(new Runnable() {
            @Override
            public void run() {
                final int currentNum=atomicInteger.get();
                System.out.println(Thread.currentThread().getName()+"  currentVal"+currentNum);

                //sleep3秒，在这3秒内，另一个线程把值先改为2再改为1，3秒后再读取仍然为1，且CAS判断为true;
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                boolean casResult=atomicInteger.compareAndSet(1,2);
                System.out.println(Thread.currentThread().getName()+"  currentVal"+
                currentNum+"  finalVal:"+atomicInteger.get()+"  casResult"+casResult
                );
            }
        });
        coreThread.start();

        Thread.sleep(100);

        Thread anotherThread=new Thread(new Runnable() {
            @Override
            public void run() {
                //向变为2
                int currentVal=atomicInteger.get();
                boolean casR1=atomicInteger.compareAndSet(1,2);
                System.out.println(Thread.currentThread().getName()+"  currentVal"+
                        currentVal+"  finalVal:"+atomicInteger.get()+"  casResult"+casR1
                );

                //再变为1
                currentVal=atomicInteger.get();
                boolean casR2=atomicInteger.compareAndSet(2,1);
                System.out.println(Thread.currentThread().getName()+"  currentVal"+
                        currentVal+"  finalVal:"+atomicInteger.get()+"  casResult"+casR2
                );

            }
        });
        anotherThread.start();
    }
}
