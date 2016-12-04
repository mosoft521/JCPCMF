package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p062ThreadPoolExecutor_2_shutdownNow.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p062ThreadPoolExecutor_2_shutdownNow.myrunnable.MyRunnable2;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable2 myRunnable = new MyRunnable2();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        Thread.sleep(1000);
        pool.shutdownNow();
        System.out.println("main end!");
    }
}
/*
任务成功完成！
main end!
任务成功完成！
任务成功完成！
Process finished with exit code 0
 */