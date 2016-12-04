package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.extthread;

import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service.MyService;

public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testA();
    }
}
/*
 */