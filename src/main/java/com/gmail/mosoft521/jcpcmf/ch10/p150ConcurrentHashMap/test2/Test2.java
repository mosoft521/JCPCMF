package com.gmail.mosoft521.jcpcmf.ch10.p150ConcurrentHashMap.test2;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        MyService2 service = new MyService2();

        Thread2A a = new Thread2A(service);
        Thread2B b = new Thread2B(service);

        a.start();
        b.start();

    }
}
/*
...
ThreadA498
ThreadA499
ThreadA500
...
ThreadB498
ThreadB499
ThreadB500

Process finished with exit code 0
 */