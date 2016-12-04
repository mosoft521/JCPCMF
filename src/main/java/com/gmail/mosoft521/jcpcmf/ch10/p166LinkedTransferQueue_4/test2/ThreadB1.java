package com.gmail.mosoft521.jcpcmf.ch10.p166LinkedTransferQueue_4.test2;

public class ThreadB1 extends Thread {
    private MyServiceB service;

    public ThreadB1(MyServiceB service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " beginA "
                + System.currentTimeMillis());
        System.out.println("tryTransfer(e) 返回值为："
                + service.queue.tryTransfer("我是数据"));
        System.out.println(Thread.currentThread().getName() + "   endA "
                + System.currentTimeMillis());
    }
}