package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p016Semaphore_MoreToOne_2.extthread;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p016Semaphore_MoreToOne_2.service.Service;

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
