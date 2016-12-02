package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p011Semaphore_tryAcquire_1.service;

import java.util.concurrent.Semaphore;

public class Service {

    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        if (semaphore.tryAcquire()) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "首选进入！");
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
            }
            semaphore.release();
        } else {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "未成功进入！");
        }
    }
}