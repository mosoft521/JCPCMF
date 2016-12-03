package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p068ThreadPoolExecutor_6.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p068ThreadPoolExecutor_6.myrunnable.MyRunnable1;
import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p068ThreadPoolExecutor_6.mythreadfactory.MyThreadFactoryA;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable = new MyRunnable1();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        pool.setThreadFactory(new MyThreadFactoryA());
        pool.execute(myRunnable);
    }
}
/*
Alvin：Sat Dec 03 21:17:23 CST 2016 1480771043598
Alvin：Sat Dec 03 21:17:23 CST 2016 1480771047598

Process finished with exit code 1
 */