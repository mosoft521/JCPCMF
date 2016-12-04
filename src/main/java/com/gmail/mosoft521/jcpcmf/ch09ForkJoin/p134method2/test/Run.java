package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p134method2.test;

import java.util.concurrent.ForkJoinPool;

public class Run {
    public static void main(String[] args) {
        try {
            ForkJoinPool pool = new ForkJoinPool();
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("ThreadName="
                            + Thread.currentThread().getName());
                }
            });
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
ThreadName=ForkJoinPool-1-worker-1
 */