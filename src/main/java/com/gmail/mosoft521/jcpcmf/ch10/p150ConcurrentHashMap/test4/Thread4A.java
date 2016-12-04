package com.gmail.mosoft521.jcpcmf.ch10.p150ConcurrentHashMap.test4;

import java.util.Iterator;

public class Thread4A extends Thread {

    private MyService4 myService;

    public Thread4A(MyService4 myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        try {
            Iterator iterator = myService.hashtable.keySet().iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
