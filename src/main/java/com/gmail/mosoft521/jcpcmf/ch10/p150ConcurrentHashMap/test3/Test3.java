package com.gmail.mosoft521.jcpcmf.ch10.p150ConcurrentHashMap.test3;

public class Test3 {
    public static void main(String[] args) {
        MyService3 service = new MyService3();
        Thread3A a = new Thread3A(service);
        Thread3B b = new Thread3B(service);
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