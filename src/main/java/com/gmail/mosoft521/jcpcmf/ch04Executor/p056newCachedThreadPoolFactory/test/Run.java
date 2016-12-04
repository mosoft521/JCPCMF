package com.gmail.mosoft521.jcpcmf.ch04Executor.p056newCachedThreadPoolFactory.test;

import com.gmail.mosoft521.jcpcmf.ch04Executor.p056newCachedThreadPoolFactory.mythreadfactory.MyThreadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
    public static void main(String[] args) {
        MyThreadFactory threadFactory = new MyThreadFactory();
        ExecutorService executorService = Executors
                .newCachedThreadPool(threadFactory);
        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("我在运行" + System.currentTimeMillis() + " "
                        + Thread.currentThread().getName());
            }
        });
    }
}
/*
我在运行1480768353414 定制池中的线程对象的名称0.7990475674406844
Process finished with exit code 1
 */