package com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p022CountDownLatch_test1.test.run;

import com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p022CountDownLatch_test1.extthread.MyThread;
import com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p022CountDownLatch_test1.service.MyService;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThread t = new MyThread(service);
        t.start();
        Thread.sleep(2000);
        service.downMethod();
    }
}
/*
A
X
B
 */