package com.gmail.mosoft521.jcpcmf.ch10.p161SynchronousQueue.extthread;

import com.gmail.mosoft521.jcpcmf.ch10.p161SynchronousQueue.service.MyService;

public class ThreadTake extends Thread {
    private MyService service;

    public ThreadTake(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            service.takeMethod();
        }
    }
}
