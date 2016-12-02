package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p001SemaphoreTest1.test;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p001SemaphoreTest1.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p001SemaphoreTest1.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p001SemaphoreTest1.extthread.ThreadC;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p001SemaphoreTest1.service.Service;

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
A begin timer=1480654366966
A   end timer=1480654371967
C begin timer=1480654371967
C   end timer=1480654376967
B begin timer=1480654376967
B   end timer=1480654381967
 */