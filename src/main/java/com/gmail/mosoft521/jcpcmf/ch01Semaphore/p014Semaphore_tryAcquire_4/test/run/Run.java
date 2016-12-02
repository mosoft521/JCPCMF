package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p014Semaphore_tryAcquire_4.test.run;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p014Semaphore_tryAcquire_4.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p014Semaphore_tryAcquire_4.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p014Semaphore_tryAcquire_4.service.Service;

public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
/*
①
ThreadName=A首选进入！
ThreadName=B首选进入！
②
ThreadName=B首选进入！
ThreadName=A首选进入！
 */