import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicClassTest {
    public static void main(String[] args) {
       // testAtomicInteger();
       // atomicIntegerArrayTest();
        testReference();
    }

    public static void testAtomicInteger(){
        int temVal=0;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        temVal=atomicInteger.get();
        System.out.println("temVal:"+temVal+" atominInteger:"+atomicInteger);
        temVal=atomicInteger.getAndSet(3);
        System.out.println("temVal:"+temVal+" atominInteger:"+atomicInteger);
        temVal=atomicInteger.getAndAdd(2);
        System.out.println("temVal:"+temVal+" atominInteger:"+atomicInteger);
        temVal=atomicInteger.getAndIncrement();
        System.out.println("temVal:"+temVal+" atominInteger:"+atomicInteger);

    }

    public static void atomicIntegerArrayTest(){
        int temVal=0;
        int [] v={0,0,0,0,0};
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(v);
        for (int i = 0; i <atomicIntegerArray.length() ; i++) {
            System.out.println(atomicIntegerArray.get(i));
        }

        temVal=atomicIntegerArray.getAndSet(0,2);
        System.out.println(temVal+"  "+atomicIntegerArray);
        temVal=atomicIntegerArray.getAndIncrement(0);
        System.out.println(temVal+"  "+atomicIntegerArray);
        temVal=atomicIntegerArray.getAndAdd(0,3);
        System.out.println(temVal+"  "+atomicIntegerArray);
    }

    public static void testReference(){
        Person person=new Person("aa",10);
        AtomicReference<Person> personAtomicReference = new AtomicReference<Person>();
        personAtomicReference.set(person);
        Person person1 = new Person("bb", 20);
        boolean b = personAtomicReference.compareAndSet(person, person1);


        System.out.println(b+personAtomicReference.get().getName());
        System.out.println(personAtomicReference.get().getAge());

    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
