package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p080get_diff.test;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class getCorePoolSize_test1 {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 100,
                TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        System.out.println("getCorePoolSize=" + executor.getCorePoolSize());
    }
}
/*
getCorePoolSize=2
Process finished with exit code 0
 */