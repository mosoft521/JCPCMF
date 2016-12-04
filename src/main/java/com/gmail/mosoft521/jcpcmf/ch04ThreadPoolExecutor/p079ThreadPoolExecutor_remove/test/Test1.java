package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p079ThreadPoolExecutor_remove.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()
                            + " begin");
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName()
                            + "   end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 100,
                TimeUnit.SECONDS, new LinkedBlockingDeque());
        executor.execute(runnable1);
        Thread.sleep(1000);
        executor.remove(runnable1);
        System.out.println("任务正在运行不能删除");
    }
}
/*
pool-1-thread-1 begin
任务正在运行不能删除
pool-1-thread-1   end
Process finished with exit code 1
 */