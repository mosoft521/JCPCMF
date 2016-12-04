package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p063test26.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p063test26.myrunnable.MyRunnableA;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) {
        try {
            MyRunnableA a1 = new MyRunnableA("A1");
            MyRunnableA a2 = new MyRunnableA("A2");
            MyRunnableA a3 = new MyRunnableA("A3");
            MyRunnableA a4 = new MyRunnableA("A4");
            ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 10, 30,
                    TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
            pool.execute(a1);
            pool.execute(a2);
            pool.execute(a3);
            pool.execute(a4);
            Thread.sleep(1000);
            pool.shutdown();
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
main end!
pool-1-thread-1 任务完成！
pool-1-thread-2 任务完成！
pool-1-thread-2 任务完成！
pool-1-thread-1 任务完成！
Process finished with exit code 0
 */