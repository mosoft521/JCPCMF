package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p061ThreadPoolExecutor_2.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p061ThreadPoolExecutor_2.myrunnable.MyRunnable1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable = new MyRunnable1();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(7, 10, 0L,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        pool.execute(myRunnable);
        pool.shutdown();
        System.out.println("main end!");
    }
}
/*
main end!
begin pool-1-thread-1 1480770291363
  end pool-1-thread-1 1480770295363
Process finished with exit code 0
 */