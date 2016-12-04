package com.gmail.mosoft521.jcpcmf.ch10.p165LinkedTransferQueue_3.test2;

public class ThreadB2 extends Thread {
    private MyServiceB service;

    public ThreadB2(MyServiceB service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " beginB "
                    + System.currentTimeMillis());
            service.queue.transfer("我从ThreadB2来");
            System.out.println(Thread.currentThread().getName() + "   endB "
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
