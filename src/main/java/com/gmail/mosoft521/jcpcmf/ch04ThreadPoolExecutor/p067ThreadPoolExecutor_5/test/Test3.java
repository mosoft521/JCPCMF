package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p067ThreadPoolExecutor_5.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p067ThreadPoolExecutor_5.myrunnable.MyRunnable2;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable2 myRunnable = new MyRunnable2();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 99999, 9999L,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.shutdown();
        System.out.println("A=" + pool.awaitTermination(1, TimeUnit.SECONDS)
                + " " + System.currentTimeMillis());
        System.out.println("B=" + pool.awaitTermination(1, TimeUnit.SECONDS)
                + " " + System.currentTimeMillis());
        System.out.println("C=" + pool.awaitTermination(1, TimeUnit.SECONDS)
                + " " + System.currentTimeMillis());
        System.out.println("D=" + pool.awaitTermination(1, TimeUnit.SECONDS)
                + " " + System.currentTimeMillis());
        System.out.println("E=" + pool.awaitTermination(1, TimeUnit.SECONDS)
                + " " + System.currentTimeMillis());
        System.out.println("F=" + pool.awaitTermination(1, TimeUnit.SECONDS)
                + " " + System.currentTimeMillis());
        System.out.println("G=" + pool.awaitTermination(1, TimeUnit.SECONDS)
                + " " + System.currentTimeMillis());
    }
}
/*
A=false 1480770872890
B=false 1480770873892
C=false 1480770874893
D=true 1480770875890
E=true 1480770875890
F=true 1480770875890
G=true 1480770875890
Process finished with exit code 0
 */