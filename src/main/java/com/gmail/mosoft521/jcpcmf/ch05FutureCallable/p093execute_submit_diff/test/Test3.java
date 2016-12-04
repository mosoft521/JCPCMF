package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p093execute_submit_diff.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) {
        try {
            ExecutorService executor = new ThreadPoolExecutor(50,
                    Integer.MAX_VALUE, 5, TimeUnit.SECONDS,
                    new LinkedBlockingDeque<Runnable>());
            Future future = executor.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Integer.parseInt("a");
                    return "我是返回值";
                }
            });
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println("能捕获异常");
        }
    }
}
/*
java.util.concurrent.ExecutionException: java.lang.NumberFormatException: For input string: "a"
	at java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.util.concurrent.FutureTask.get(FutureTask.java:192)
	at com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p093execute_submit_diff.test.Test3.main(Test3.java:25)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Caused by: java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p093execute_submit_diff.test.Test3$1.call(Test3.java:21)
	at com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p093execute_submit_diff.test.Test3$1.call(Test3.java:18)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)
能捕获异常
Process finished with exit code 1
 */