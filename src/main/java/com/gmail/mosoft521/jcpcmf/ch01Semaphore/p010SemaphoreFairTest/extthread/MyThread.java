package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p010SemaphoreFairTest.extthread;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p010SemaphoreFairTest.myservice.MyService;

public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        System.out.println("ThreadName=" + this.getName() + "启动了！");
        myService.testMethod();
    }
}