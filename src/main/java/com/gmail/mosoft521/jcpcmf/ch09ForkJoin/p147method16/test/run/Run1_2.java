package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p147method16.test.run;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p147method16.mytask.MyRecursiveTask1;

import java.util.concurrent.ForkJoinPool;

public class Run1_2 {

    public static void main(String[] args) throws InterruptedException {
        MyRecursiveTask1 task1 = null;
        ForkJoinPool pool = new ForkJoinPool();
        for (int i = 0; i < 50; i++) {
            task1 = new MyRecursiveTask1();
            pool.submit(task1);
        }
        Thread.sleep(50);
        System.out.println("getParallelism()=" + pool.getParallelism()
                + " getPoolSize()=" + pool.getPoolSize()
                + " getQueuedSubmissionCount()="
                + pool.getQueuedSubmissionCount() + " hasQueuedSubmissions()="
                + pool.hasQueuedSubmissions());
        do {
        } while (!task1.isDone());
    }
}
/*
begin=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-0
getParallelism()=4 getPoolSize()=4 getQueuedSubmissionCount()=46 hasQueuedSubmissions()=true
  end=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-2
  end=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-0
begin=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-2
  end=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-0
begin=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-2
  end=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-0
begin=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-2
  end=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-0
begin=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-2
  end=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-0
begin=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-2
  end=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-0
begin=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-2
  end=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-0
begin=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-2
  end=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-0
begin=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-2
  end=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-0
begin=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-2
  end=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-0
begin=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-2
begin=ForkJoinPool-1-worker-2
  end=ForkJoinPool-1-worker-3
begin=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-1
begin=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-0
begin=ForkJoinPool-1-worker-0
  end=ForkJoinPool-1-worker-2
  end=ForkJoinPool-1-worker-3
  end=ForkJoinPool-1-worker-1
  end=ForkJoinPool-1-worker-0

Process finished with exit code 0
 */