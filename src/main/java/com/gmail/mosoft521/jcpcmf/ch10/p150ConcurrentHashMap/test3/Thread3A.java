package com.gmail.mosoft521.jcpcmf.ch10.p150ConcurrentHashMap.test3;

public class Thread3A extends Thread {

    private MyService3 service;

    public Thread3A(MyService3 service) {
        super();
        this.service = service;
    }

    public void run() {
        for (int i = 0; i < 500; i++) {
            service.map.put("ThreadA" + (i + 1), "ThreadA" + i + 1);
            System.out.println("ThreadA" + (i + 1));
        }
    }

}
