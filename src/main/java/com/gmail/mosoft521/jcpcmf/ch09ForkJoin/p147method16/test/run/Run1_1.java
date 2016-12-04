package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p147method16.test.run;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p147method16.mytask.MyRecursiveTask1;

import java.util.concurrent.ForkJoinPool;

public class Run1_1 {
    public static void main(String[] args) throws InterruptedException {
        MyRecursiveTask1 task1 = new MyRecursiveTask1();
        MyRecursiveTask1 task2 = new MyRecursiveTask1();
        MyRecursiveTask1 task3 = new MyRecursiveTask1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(task1);
        pool.submit(task2);
        pool.submit(task3);
        System.out.println("并行数getParallelism()=" + pool.getParallelism()
                + " 线程池大小getPoolSize()=" + pool.getPoolSize());
        pool.shutdown();
        do {
        } while (!pool.isTerminated());
        System.out.println("main end!");
    }
}
/*
并行数getParallelism()=4 线程池大小getPoolSize()=3
begin=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-2
main end!
Process finished with exit code 0
 */