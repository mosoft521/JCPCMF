package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p092RejectedExecutionHandlerTest.test.run;

import com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p092RejectedExecutionHandlerTest.executionhandler.MyRejectedExecutionHandler;
import com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p092RejectedExecutionHandlerTest.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Run {

    public static void main(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();
        ThreadPoolExecutor executor = (ThreadPoolExecutor) service;
        executor.setRejectedExecutionHandler(new MyRejectedExecutionHandler());
        service.submit(new MyRunnable("A"));
        service.submit(new MyRunnable("B"));
        service.submit(new MyRunnable("C"));
        executor.shutdown();
        service.submit(new MyRunnable("D"));
    }
}
/*
java.util.concurrent.FutureTask@6d6f6e28 被拒绝!
C 在运行！
A 在运行！
B 在运行！

Process finished with exit code 0
 */