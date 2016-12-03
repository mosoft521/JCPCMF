package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingDequeTest1 {

    public static void main(String[] args) throws InterruptedException {
        // LinkedBlockingDeque使用带参构造
        // max值被参考
        LinkedBlockingDeque linked = new LinkedBlockingDeque<Runnable>(2);
        System.out.println(linked.size());
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
                TimeUnit.SECONDS, linked);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        System.out.println(pool.getPoolSize() + " " + linked.size());
        // 先放入队列2个任务，再执行3个任务
    }
}
/*
0
begin 1480771992212
3 2
begin 1480771992212
begin 1480771992212
  end 1480771993214
begin 1480771993214
  end 1480771993214
begin 1480771993214
  end 1480771993223
  end 1480771994214
  end 1480771994214

Process finished with exit code 1
 */