package com.gmail.mosoft521.jcpcmf.ch10.p163LinkedTransferQueue_1.test1;

public class Test1 {
    public static void main(String[] args) {
        MyServiceA service = new MyServiceA();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
/*
Thread-0 begin 1480839106138
阻塞住了？
Process finished with exit code 1
 */