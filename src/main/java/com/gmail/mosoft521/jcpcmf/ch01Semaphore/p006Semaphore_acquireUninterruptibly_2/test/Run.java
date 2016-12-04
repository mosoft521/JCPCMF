package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p006Semaphore_acquireUninterruptibly_2.test;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p006Semaphore_acquireUninterruptibly_2.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p006Semaphore_acquireUninterruptibly_2.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p006Semaphore_acquireUninterruptibly_2.service.Service;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000);
        b.interrupt();
        System.out.println("main中断了a");
    }
}
/*
A begin timer=1480667635595
A   end timer=1480667636557
B begin timer=1480667636557
main中断了a
B   end timer=1480667637483
 */