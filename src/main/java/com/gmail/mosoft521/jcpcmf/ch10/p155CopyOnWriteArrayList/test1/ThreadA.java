package com.gmail.mosoft521.jcpcmf.ch10.p155CopyOnWriteArrayList.test1;

public class ThreadA extends Thread {

    private MyServiceA service;

    public ThreadA(MyServiceA service) {
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
