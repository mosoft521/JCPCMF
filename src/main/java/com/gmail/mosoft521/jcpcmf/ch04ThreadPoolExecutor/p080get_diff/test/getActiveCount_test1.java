package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p080get_diff.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p080get_diff.extthread.MyThreadA;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class getActiveCount_test1 {

    public static void main(String[] args) throws InterruptedException {
        try {
            MyThreadA a = new MyThreadA();

            SynchronousQueue queue = new SynchronousQueue();
            ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 5, 5,
                    TimeUnit.SECONDS, queue);
            pool.execute(a);
            pool.execute(a);
            pool.execute(a);
            System.out
                    .println(pool.getActiveCount() + " " + pool.getPoolSize());
            Thread.sleep(7000);
            System.out
                    .println(pool.getActiveCount() + " " + pool.getPoolSize());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
 begin pool-1-thread-1 1480772737994 运行中
 begin pool-1-thread-2 1480772737994 运行中
 begin pool-1-thread-3 1480772737994 运行中
3 3
   end pool-1-thread-3 1480772742994 运行中
   end pool-1-thread-1 1480772742994 运行中
   end pool-1-thread-2 1480772742994 运行中
0 3

Process finished with exit code 1
 */