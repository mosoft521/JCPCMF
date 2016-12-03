package com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p024CountDownLatch_test2.extthread;

import com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p024CountDownLatch_test2.service.MyService;

public class MyThread extends Thread {

    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}