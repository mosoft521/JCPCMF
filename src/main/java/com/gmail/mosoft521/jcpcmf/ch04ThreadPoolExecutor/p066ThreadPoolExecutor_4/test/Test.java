package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p066ThreadPoolExecutor_4.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p066ThreadPoolExecutor_4.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable = new MyRunnable();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 99999,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        System.out.println(pool.isTerminating() + " " + pool.isTerminated());
        pool.shutdown();
        Thread.sleep(1000);
        System.out.println(pool.isTerminating() + " " + pool.isTerminated());
        Thread.sleep(1000);
        System.out.println(pool.isTerminating() + " " + pool.isTerminated());
        Thread.sleep(1000);
        System.out.println(pool.isTerminating() + " " + pool.isTerminated());
        Thread.sleep(1000);
        System.out.println(pool.isTerminating() + " " + pool.isTerminated());
        Thread.sleep(1000);
        System.out.println(pool.isTerminating() + " " + pool.isTerminated());
    }
}
/*
false false
pool-1-thread-1 begin 1480770710130
pool-1-thread-2 begin 1480770710130
true false
pool-1-thread-2   end 1480770712130
pool-1-thread-1   end 1480770712130
true false
pool-1-thread-2 begin 1480770712130
pool-1-thread-1 begin 1480770712130
true false
pool-1-thread-2   end 1480770714130
pool-1-thread-1   end 1480770714130
true false
false true
Process finished with exit code 0
 */