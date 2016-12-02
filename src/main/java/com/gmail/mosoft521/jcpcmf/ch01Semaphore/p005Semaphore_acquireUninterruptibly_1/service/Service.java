package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p005Semaphore_acquireUninterruptibly_1.service;

import java.util.concurrent.Semaphore;

public class Service {

    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()
                    + " begin timer=" + System.currentTimeMillis());
            for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
                String newString = new String();
                Math.random();
            }
            System.out.println(Thread.currentThread().getName()
                    + "   end timer=" + System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            System.out.println("线程" + Thread.currentThread().getName()
                    + "进入了catch");
            e.printStackTrace();
        }
    }

}
