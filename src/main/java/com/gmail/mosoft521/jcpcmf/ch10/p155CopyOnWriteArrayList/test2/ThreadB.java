package com.gmail.mosoft521.jcpcmf.ch10.p155CopyOnWriteArrayList.test2;

public class ThreadB extends Thread {

    private MyServiceB service;

    public ThreadB(MyServiceB service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            service.list.add("anyString");
        }
    }
}
