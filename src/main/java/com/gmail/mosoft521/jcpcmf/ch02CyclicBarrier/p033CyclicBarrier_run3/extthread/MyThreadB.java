package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p033CyclicBarrier_run3.extthread;

import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p033CyclicBarrier_run3.service.MyService;

public class MyThreadB extends Thread {
    private MyService service;

    public MyThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
