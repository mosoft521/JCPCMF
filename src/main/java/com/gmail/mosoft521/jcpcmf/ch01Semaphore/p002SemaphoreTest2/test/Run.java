package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p002SemaphoreTest2.test;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p002SemaphoreTest2.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p002SemaphoreTest2.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p002SemaphoreTest2.extthread.ThreadC;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p002SemaphoreTest2.service.Service;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        ThreadC c = new ThreadC(service);
        c.setName("C");
        a.start();
        b.start();
        c.start();
    }
}
/*
A begin timer=1480654548262
B begin timer=1480654548262
A   end timer=1480654553262
B   end timer=1480654553262
C begin timer=1480654553262
C   end timer=1480654558262
 */