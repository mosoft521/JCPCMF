package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p080get_diff.test;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class getPoolSize_test1 {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 100,
                TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        System.out.println(executor.getPoolSize());
    }
}
/*
3

Process finished with exit code 1
 */