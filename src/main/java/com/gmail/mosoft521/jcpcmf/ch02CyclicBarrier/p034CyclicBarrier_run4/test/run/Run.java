package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p034CyclicBarrier_run4.test.run;

import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p034CyclicBarrier_run4.extthread.MyThreadA;
import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p034CyclicBarrier_run4.extthread.MyThreadB;
import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p034CyclicBarrier_run4.extthread.MyThreadC;
import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p034CyclicBarrier_run4.service.MyService;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.setName("A");
        MyThreadB b = new MyThreadB(service);
        b.setName("B");
        MyThreadC c = new MyThreadC(service);
        c.setName("C");

        a.start();
        b.start();
        c.start();

        Thread.sleep(2000);
        System.out.println("屏障对象的parties个数为："
                + service.cyclicBarrier.getParties());
        System.out.println("在屏障处等待的线程个数为："
                + service.cyclicBarrier.getNumberWaiting());
    }
}
/*
B 准备！1480754592530
A 准备！1480754592531
C 准备！1480754592532
屏障对象的parties个数为：3
在屏障处等待的线程个数为：2

Process finished with exit code 1
 */