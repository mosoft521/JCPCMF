package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p012Semaphore_tryAcquire_2.test.run;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p012Semaphore_tryAcquire_2.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p012Semaphore_tryAcquire_2.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p012Semaphore_tryAcquire_2.service.Service;

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
ThreadName=B首选进入！
ThreadName=A未成功进入！
②
ThreadName=A首选进入！
ThreadName=B未成功进入！
 */