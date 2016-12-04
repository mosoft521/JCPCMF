package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p142method9.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p142method9.myrunnable.MyRunnable1;

import java.util.concurrent.ForkJoinPool;

public class Test0 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable = new MyRunnable1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(myRunnable);
        Thread.sleep(2000);
        pool.shutdownNow();
        System.out.println("main end");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
/*
java.lang.InterruptedException
main end
	at com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p142method9.myrunnable.MyRunnable1.run(MyRunnable1.java:17)
任务没有完成，就中断了！
	at java.util.concurrent.ForkJoinTask$AdaptedRunnableAction.exec(ForkJoinTask.java:1386)
进入catch中断了任务
	at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
	at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1056)
	at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1692)
	at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:157)
Process finished with exit code 1
 */