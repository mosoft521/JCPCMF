package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p065ThreadPoolExecutor_3.test.run;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

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
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2,
                Integer.MAX_VALUE, TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);
        System.out.println("A=" + executor.isShutdown());
        executor.shutdown();
        System.out.println("B=" + executor.isShutdown());
    }

}
/*
A=false
B=true
打印了！begin pool-1-thread-1
打印了！      end pool-1-thread-1

Process finished with exit code 0
 */