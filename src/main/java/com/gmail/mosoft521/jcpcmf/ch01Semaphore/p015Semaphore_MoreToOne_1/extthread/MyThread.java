package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p015Semaphore_MoreToOne_1.extthread;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p015Semaphore_MoreToOne_1.service.Service;

public class MyThread extends Thread {

    private Service service;

    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.sayHello();
    }

}
