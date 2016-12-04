package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p131forkjoin_2.test.run;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p131forkjoin_2.mytask.MyRecursiveTask;

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
ForkJoinPool-1-worker-1----------------
compute=1 5
!=0
left  传入的值:1 3
# 1 3
right 传入的值:4 5
# 4 5
ForkJoinPool-1-worker-1----------------
compute=1 3
!=0
left  传入的值:1 2
# 1 2
right 传入的值:3 3
# 3 3
ForkJoinPool-1-worker-1----------------
compute=1 2
!=0
left  传入的值:1 1
# 1 1
right 传入的值:2 2
# 2 2
ForkJoinPool-1-worker-1----------------
compute=1 1
ForkJoinPool-1-worker-1----------------
compute=2 2
ForkJoinPool-1-worker-1----------------
compute=3 3
ForkJoinPool-1-worker-1----------------
compute=4 5
!=0
left  传入的值:4 4
# 4 4
right 传入的值:5 5
# 5 5
ForkJoinPool-1-worker-1----------------
compute=4 4
ForkJoinPool-1-worker-1----------------
compute=5 5
结果值为：15
 */