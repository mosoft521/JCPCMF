package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p009twoMethodTest.extthread;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p009twoMethodTest.myservice.MyService;

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