package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p018RepastTest.extthread;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p018RepastTest.service.RepastService;

public class ThreadC extends Thread {
    private RepastService service;

    public ThreadC(RepastService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.get();
    }
}