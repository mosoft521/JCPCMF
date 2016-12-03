package com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p023CountDownLatch_test3.test.run;

import com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p023CountDownLatch_test3.extthread.MyThread;

import java.util.concurrent.CountDownLatch;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch maxRuner = new CountDownLatch(10);
        MyThread[] tArray = new MyThread[Integer.parseInt("" + maxRuner.getCount())];
        for (int i = 0; i < tArray.length; i++) {
            tArray[i] = new MyThread(maxRuner);
            tArray[i].setName("线程" + (i + 1));
            tArray[i].start();
        }
        maxRuner.await();
        System.out.println("都回来了！");
    }
}
/*
都回来了！
 */