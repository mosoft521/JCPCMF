package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p145method12.test.run;

import java.util.concurrent.ForkJoinPool;

public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("打印了！begin "
                            + Thread.currentThread().getName());
                    Thread.sleep(1000);
                    System.out.println("打印了！      end "
                            + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(runnable);
        System.out.println("A=" + pool.isShutdown());
        pool.shutdownNow();
        Thread.sleep(5000);
        System.out.println("B=" + pool.isShutdown());
    }
}
/*
java.lang.InterruptedException: sleep interrupted
A=false
	at java.lang.Thread.sleep(Native Method)
打印了！begin ForkJoinPool-1-worker-1
	at com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p145method12.test.run.Run1$1.run(Run1.java:13)
	at java.util.concurrent.ForkJoinTask$RunnableExecuteAction.exec(ForkJoinTask.java:1402)
	at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
	at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1056)
	at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1692)
	at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:157)
B=true
Process finished with exit code 0
 */