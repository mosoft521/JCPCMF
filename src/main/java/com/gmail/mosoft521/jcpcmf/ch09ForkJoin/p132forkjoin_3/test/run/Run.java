package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p132forkjoin_3.test.run;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p132forkjoin_3.mytask.MyRecursiveTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        try {
            MyRecursiveTask task = new MyRecursiveTask(1, 5);
            ForkJoinPool pool = new ForkJoinPool();
            pool.submit(task);
            System.out.println("结果值为：" + task.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
/*
# 1 5
compute=1 5
!=0
left  传入的值:1 3
# 1 3
right 传入的值:4 5
# 4 5
compute=1 3
compute=4 5
结果值为：15
 */