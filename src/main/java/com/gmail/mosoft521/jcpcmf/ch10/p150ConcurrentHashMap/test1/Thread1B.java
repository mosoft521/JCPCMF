package com.gmail.mosoft521.jcpcmf.ch10.p150ConcurrentHashMap.test1;

public class Thread1B extends Thread {

    private MyService1 service;

    public Thread1B(MyService1 service) {
        super();
        this.service = service;
    }

    public void run() {
        for (int i = 0; i < 500; i++) {
            service.map.put("ThreadB" + (i + 1), "ThreadB" + i + 1);
            System.out.println("ThreadB" + (i + 1));
        }
    }
}
