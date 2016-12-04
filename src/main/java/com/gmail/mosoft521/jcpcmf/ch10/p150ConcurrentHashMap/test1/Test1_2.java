package com.gmail.mosoft521.jcpcmf.ch10.p150ConcurrentHashMap.test1;

public class Test1_2 {

    public static void main(String[] args) throws InterruptedException {
        MyService1 service = new MyService1();

        Thread1A a = new Thread1A(service);
        Thread1B b = new Thread1B(service);

        a.start();
        b.start();
    }
}
/*
...
ThreadB499
ThreadB500
...
ThreadA498
ThreadA499
ThreadA500

Process finished with exit code 0
 */