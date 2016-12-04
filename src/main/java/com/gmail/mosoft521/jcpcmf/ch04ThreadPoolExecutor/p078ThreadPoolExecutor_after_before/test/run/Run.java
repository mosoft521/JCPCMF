package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p078ThreadPoolExecutor_after_before.test.run;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p078ThreadPoolExecutor_after_before.executor.MyThreadPoolExecutor;
import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p078ThreadPoolExecutor_after_before.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThreadPoolExecutor executor = new MyThreadPoolExecutor(2, 2,
                Integer.MAX_VALUE, TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>());
        executor.execute(new MyRunnable("A1"));
        executor.execute(new MyRunnable("A2"));
        executor.execute(new MyRunnable("A3"));
        executor.execute(new MyRunnable("A4"));
    }
}
/*
准备执行：A2
准备执行：A1
打印了！begin A2 1480772502507
打印了！begin A1 1480772502507
打印了！      end A2 1480772506507
打印了！      end A1 1480772506507
A2 执行完了
A1 执行完了
准备执行：A3
准备执行：A4
打印了！begin A3 1480772506507
打印了！begin A4 1480772506507
打印了！      end A4 1480772510507
打印了！      end A3 1480772510507
A4 执行完了
A3 执行完了
Process finished with exit code 1
 */