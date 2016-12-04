package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p130test5.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p130test5.task.MyRecursiveTask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        MyRecursiveTask task = new MyRecursiveTask(1, 20);
        ForkJoinTask<String> runTaskA = pool.submit(task);
        System.out.println(runTaskA.join());
        Thread.sleep(5000);
    }
}
/*
ForkJoinPool-1-worker-1 -----------
ForkJoinPool-1-worker-1 -----------
ForkJoinPool-1-worker-1 -----------
ForkJoinPool-1-worker-1 -----------
else返回：123     1 3
ForkJoinPool-1-worker-1 -----------
else返回：45     4 5
ForkJoinPool-1-worker-1 -----------
ForkJoinPool-1-worker-1 -----------
else返回：678     6 8
ForkJoinPool-1-worker-1 -----------
else返回：910     9 10
ForkJoinPool-1-worker-2 -----------
ForkJoinPool-1-worker-2 -----------
ForkJoinPool-1-worker-1 -----------
ForkJoinPool-1-worker-1 -----------
else返回：161718     16 18
ForkJoinPool-1-worker-1 -----------
else返回：1920     19 20
ForkJoinPool-1-worker-1 -----------
else返回：1415     14 15
ForkJoinPool-1-worker-2 -----------
else返回：111213     11 13
1234567891011121314151617181920
 */