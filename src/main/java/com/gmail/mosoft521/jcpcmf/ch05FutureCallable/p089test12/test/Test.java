package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p089test12.test;

import com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p089test12.mycallable.MyCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        MyCallable callable = new MyCallable();
        ExecutorService executor = new ThreadPoolExecutor(50,
                Integer.MAX_VALUE, 5, TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>());
        Future<String> future = executor.submit(callable);
        Thread.sleep(3000);
        System.out.println(future.cancel(false) + " " + future.isCancelled());
    }
}
/*
pool-1-thread-1 1480817031217
pool-1-thread-1 1480817031217
...
pool-1-thread-1 1480817031218
pool-1-thread-1 1480817031218
pool-1-thread-1 1480817031218
...
Process finished with exit code 1
 */