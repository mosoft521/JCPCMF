package com.gmail.mosoft521.jcpcmf.ch10.p159LinkedBlockingQueue.extthread;

import com.gmail.mosoft521.jcpcmf.ch10.p159LinkedBlockingQueue.service.MyServiceA;

public class ThreadA extends Thread {

    private MyServiceA service;

    public ThreadA(MyServiceA service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            service.serviceMethod();
        }
        System.out.println("z");
    }

}
