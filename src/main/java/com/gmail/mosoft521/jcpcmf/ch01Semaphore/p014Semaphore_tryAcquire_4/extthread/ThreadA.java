package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p014Semaphore_tryAcquire_4.extthread;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p014Semaphore_tryAcquire_4.service.Service;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
