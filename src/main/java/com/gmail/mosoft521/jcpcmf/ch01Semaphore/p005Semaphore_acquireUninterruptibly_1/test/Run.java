package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p005Semaphore_acquireUninterruptibly_1.test;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p005Semaphore_acquireUninterruptibly_1.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p005Semaphore_acquireUninterruptibly_1.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p005Semaphore_acquireUninterruptibly_1.service.Service;

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
A begin timer=1480667405336
A   end timer=1480667406318
B begin timer=1480667406318
main中断了a
B   end timer=1480667407233
 */