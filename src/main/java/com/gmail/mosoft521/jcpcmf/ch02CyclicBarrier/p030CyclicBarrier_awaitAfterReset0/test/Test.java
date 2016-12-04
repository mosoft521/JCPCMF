package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p030CyclicBarrier_awaitAfterReset0.test;

import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p030CyclicBarrier_awaitAfterReset0.extthread.ThreadA;

import java.util.concurrent.CyclicBarrier;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cbRef = new CyclicBarrier(3);
        ThreadA threadA1 = new ThreadA(cbRef);
        threadA1.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());
        ThreadA threadA2 = new ThreadA(cbRef);
        threadA2.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());
        ThreadA threadA3 = new ThreadA(cbRef);
        threadA3.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());
        ThreadA threadA4 = new ThreadA(cbRef);
        threadA4.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());
    }
}
/*
1
2
0
1
Process finished with exit code 1
 */