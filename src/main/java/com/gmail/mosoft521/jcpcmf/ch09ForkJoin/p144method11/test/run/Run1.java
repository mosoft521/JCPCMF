package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p144method11.test.run;

import java.util.concurrent.ForkJoinPool;

public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("打印了！begin "
                            + Thread.currentThread().getName());
                    Thread.sleep(1000);
                    System.out.println("打印了！      end "
                            + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(runnable);
        System.out.println("A=" + pool.isShutdown());
        pool.shutdown();
        Thread.sleep(5000);
        System.out.println("B=" + pool.isShutdown());
    }

}
/*
A=false
打印了！begin ForkJoinPool-1-worker-1
打印了！      end ForkJoinPool-1-worker-1
B=true

Process finished with exit code 0
 */