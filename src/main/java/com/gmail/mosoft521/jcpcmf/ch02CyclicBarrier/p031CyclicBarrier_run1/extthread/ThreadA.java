package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p031CyclicBarrier_run1.extthread;

import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p031CyclicBarrier_run1.service.MyService;

public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.beginRun();
    }
}