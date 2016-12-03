package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p070ThreadPoolExecutor_8.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p070ThreadPoolExecutor_8.myrunnable.MyRunnable;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(4, 5, 5,
                TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        pool.allowCoreThreadTimeOut(true);
        System.out.println(pool.allowsCoreThreadTimeOut());
        for (int i = 0; i < 4; i++) {
            MyRunnable runnable = new MyRunnable();
            pool.execute(runnable);
        }
        Thread.sleep(8000);
        System.out.println(pool.getPoolSize());
    }
}
/*
true
pool-1-thread-1 begin 1480771365628
pool-1-thread-1   end 1480771365628
pool-1-thread-3 begin 1480771365628
pool-1-thread-3   end 1480771365629
pool-1-thread-4 begin 1480771365629
pool-1-thread-4   end 1480771365629
pool-1-thread-2 begin 1480771365630
pool-1-thread-2   end 1480771365630
0

Process finished with exit code 0
 */