package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p092RejectedExecutionHandlerTest.executionhandler;

import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class MyRejectedExecutionHandler implements RejectedExecutionHandler {
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(((FutureTask) r).toString() + " 被拒绝!");
    }
}
