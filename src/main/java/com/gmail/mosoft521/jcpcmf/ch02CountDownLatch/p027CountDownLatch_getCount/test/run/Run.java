package com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p027CountDownLatch_getCount.test.run;

import java.util.concurrent.CountDownLatch;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch count = new CountDownLatch(3);
        System.out.println("main getCount1=" + count.getCount());
        count.countDown();
        System.out.println("main getCount2=" + count.getCount());
        count.countDown();
        System.out.println("main getCount3=" + count.getCount());
        count.countDown();
        System.out.println("main getCount4=" + count.getCount());
        count.countDown();
        System.out.println("main getCount5=" + count.getCount());
        count.countDown();
        System.out.println("main getCount6=" + count.getCount());
    }
}
/*
main getCount1=3
main getCount2=2
main getCount3=1
main getCount4=0
main getCount5=0
main getCount6=0
 */