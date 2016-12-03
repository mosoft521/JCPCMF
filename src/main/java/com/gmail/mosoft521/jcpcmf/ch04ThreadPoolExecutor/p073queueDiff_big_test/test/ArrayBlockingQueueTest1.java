package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.myrunnable.MyRunnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueTest1 {

    public static void main(String[] args) throws InterruptedException {
        // ArrayBlockingQueue使用带参构造
        // max值被参考
        ArrayBlockingQueue array = new ArrayBlockingQueue(2);
        System.out.println(array.size());
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
                TimeUnit.SECONDS, array);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        System.out.println(pool.getPoolSize() + " " + array.size());
        // 先放入队列2个任务，再执行3个任务
    }
}
/*
0
3 2
begin 1480771937838
begin 1480771937838
begin 1480771937838
  end 1480771938838
begin 1480771938838
  end 1480771938840
begin 1480771938840
  end 1480771938840
  end 1480771939838
  end 1480771939840

Process finished with exit code 1
 */