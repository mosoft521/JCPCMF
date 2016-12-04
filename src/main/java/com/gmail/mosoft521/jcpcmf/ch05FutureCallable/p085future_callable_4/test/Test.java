package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p085future_callable_4.test;

import com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p085future_callable_4.mycallable.MyCallable;

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
        System.out.println(future.get());
        System.out.println(future.cancel(true));
    }
}
/*
我的年龄是100
false

Process finished with exit code 1
 */