import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReferenceDemo {


    public static void main(String[] args) {
        final int initVal=0,initStamp=0;
        final AtomicStampedReference<Integer> asr=new AtomicStampedReference<>(initVal,initStamp);
        System.out.println("reference: "+asr.getReference()+" stamp:"+asr.getReference());

        //cas
        final Integer newVal=999,newStamp=666;
        boolean b = asr.compareAndSet(initVal, newVal, initStamp, newStamp);
        System.out.println("reference: "+asr.getReference()+" stamp:"+asr.getStamp()
        +"  result: "+b);

        //get(stamp的数组)
        int[] arr=new int[1];
        final int currentVal=asr.get(arr);
        final int currentStamp=arr[0];
        System.out.println("currentreference: "+currentVal+" currentstamp:"+currentStamp);

        //单独设置stamp attempStam(Integer,)
        //boolean b1 = asr.attemptStamp(999, 888);
        System.out.println(asr.getReference());
        boolean b1 = asr.attemptStamp(newVal, 100);
        System.out.println(b1+"  "+asr.getReference() +"  "+asr.getStamp());

        System.out.println(asr.compareAndSet(newVal,1,10,1));

        //重新设置
        asr.set(0,0);
        System.out.println(asr.getReference() +"  "+asr.getStamp());
    }
}
