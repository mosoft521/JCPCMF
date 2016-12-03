package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingDequeTest3 {

    public static void main(String[] args) throws InterruptedException {
        // LinkedBlockingDeque使用无参构造
        // max值被忽略
        LinkedBlockingDeque linked = new LinkedBlockingDeque<Runnable>();
        System.out.println(linked.size());
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
                TimeUnit.SECONDS, linked);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        System.out.println(pool.getPoolSize() + " " + linked.size());
        // 使用new LinkedBlockingDeque<Runnable>();无参构造
        // capacity值是Integer.MAX_VALUE
        // 源代码如下：
        // public LinkedBlockingDeque() {
        // this(Integer.MAX_VALUE);
        // }
        // 说明LinkedBlockingDeque队列
        // 里面可以存储Integer.MAX_VALUE
        // 个数据
        // 先放入队列3个任务，再执行2个任务
    }
}
/*
0
2 3
begin 1480772036324
begin 1480772036324
  end 1480772037324
begin 1480772037324
  end 1480772037324
begin 1480772037324
  end 1480772038324
  end 1480772038324
begin 1480772038324
  end 1480772039324

Process finished with exit code 1
 */