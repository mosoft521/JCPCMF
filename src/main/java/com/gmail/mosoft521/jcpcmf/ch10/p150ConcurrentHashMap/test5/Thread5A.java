package com.gmail.mosoft521.jcpcmf.ch10.p150ConcurrentHashMap.test5;

import java.util.Iterator;

public class Thread5A extends Thread {
    private MyService5 myService;

    public Thread5A(MyService5 myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        try {
            Iterator iterator = myService.map.keySet().iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
