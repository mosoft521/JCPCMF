package com.gmail.mosoft521.jcpcmf.ch10.p168LinkedTransferQueue_6.test3;

public class ThreadC extends Thread {
    private MyServiceC service;

    public ThreadC(MyServiceC service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " 取得的值："
                    + service.queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}