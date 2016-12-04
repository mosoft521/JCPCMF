package com.gmail.mosoft521.jcpcmf.ch10.p153ConcurrentLinkedQueue.test1;

import com.gmail.mosoft521.jcpcmf.ch10.p153ConcurrentLinkedQueue.myservice.MyService1;

public class Test1 {
    public static void main(String[] args) {
        try {
            MyService1 service = new MyService1();
            ThreadA a = new ThreadA(service);
            ThreadB b = new ThreadB(service);
            a.start();
            b.start();
            a.join();
            b.join();
            System.out.println(service.queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
100
Process finished with exit code 0
 */