package com.gmail.mosoft521.jcpcmf.ch10.p150ConcurrentHashMap.test4;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        try {
            MyService4 myService = new MyService4();
            Thread4A a = new Thread4A(myService);
            a.start();
            Thread.sleep(1000);
            Thread4B b = new Thread4B(myService);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
String5
Exception in thread "Thread-0" java.util.ConcurrentModificationException
	at java.util.Hashtable$Enumerator.next(Hashtable.java:1367)
	at com.gmail.mosoft521.jcpcmf.ch10.p150ConcurrentHashMap.test4.Thread4A.run(Thread4A.java:19)
Process finished with exit code 0
 */