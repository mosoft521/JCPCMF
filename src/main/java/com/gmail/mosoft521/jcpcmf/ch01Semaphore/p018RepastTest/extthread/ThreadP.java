package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p018RepastTest.extthread;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p018RepastTest.service.RepastService;

public class ThreadP extends Thread {
    private RepastService service;

    public ThreadP(RepastService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.set();
    }
}