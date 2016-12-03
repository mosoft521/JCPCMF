package com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p026CountDownLatch_wait.extthread;

import com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p026CountDownLatch_wait.service.MyService;

public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}