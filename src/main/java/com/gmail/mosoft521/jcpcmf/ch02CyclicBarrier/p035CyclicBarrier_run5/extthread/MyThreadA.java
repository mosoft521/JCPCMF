package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p035CyclicBarrier_run5.extthread;

import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p035CyclicBarrier_run5.service.MyService;

public class MyThreadA extends Thread {

    private MyService service;

    public MyThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}