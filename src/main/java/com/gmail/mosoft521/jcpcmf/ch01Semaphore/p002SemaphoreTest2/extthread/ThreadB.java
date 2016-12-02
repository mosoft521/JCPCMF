package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p002SemaphoreTest2.extthread;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p002SemaphoreTest2.service.Service;

public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }

}
