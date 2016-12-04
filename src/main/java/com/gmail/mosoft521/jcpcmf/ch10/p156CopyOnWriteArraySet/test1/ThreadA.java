package com.gmail.mosoft521.jcpcmf.ch10.p156CopyOnWriteArraySet.test1;

public class ThreadA extends Thread {
    private MyServiceA service;

    public ThreadA(MyServiceA service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            service.set.add(Thread.currentThread().getName() + "anyString"
                    + (i + 1));
        }
    }
}
