package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p129test4.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p129test4.task.MyRecursiveTaskA;
import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p129test4.task.MyRecursiveTaskB;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> runTaskA = pool.submit(new MyRecursiveTaskA());
        ForkJoinTask<Integer> runTaskB = pool.submit(new MyRecursiveTaskB());
        System.out.println("准备打印：" + System.currentTimeMillis());
        System.out.println(runTaskA.join() + " A：" + System.currentTimeMillis());
        System.out.println(runTaskB.join() + " B：" + System.currentTimeMillis());
        Thread.sleep(5000);
    }
}
/*
准备打印：1480832604130
ForkJoinPool-1-worker-1 begin A 1480832604131
ForkJoinPool-1-worker-2 begin B 1480832604131
ForkJoinPool-1-worker-1   end A 1480832607132
100 A：1480832607132
ForkJoinPool-1-worker-2   end B 1480832609132
100 B：1480832609132
 */