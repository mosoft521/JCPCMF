package com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p024CountDownLatch_test2.service;

import java.util.concurrent.CountDownLatch;

public class MyService {

    private CountDownLatch down = new CountDownLatch(1);

    public void testMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "准备");
            down.await();
            System.out.println(Thread.currentThread().getName() + "结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void downMethod() {
        System.out.println("开始");
        down.countDown();
    }
}