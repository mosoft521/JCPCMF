package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p093execute_submit_diff.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {

    public static void main(String[] args) {
        ExecutorService executor = new ThreadPoolExecutor(50,
                Integer.MAX_VALUE, 5, TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>());
        executor.execute(new Runnable() {
            @Override
            public void run() {
                Integer.parseInt("a");
            }
        });
    }
}
/*
Exception in thread "pool-1-thread-1" java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p093execute_submit_diff.test.Test2$1.run(Test2.java:17)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)

Process finished with exit code 1
 */