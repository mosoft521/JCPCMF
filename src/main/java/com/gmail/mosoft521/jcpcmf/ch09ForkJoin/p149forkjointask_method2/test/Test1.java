package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p149forkjointask_method2.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p149forkjointask_method2.mytask.MyRecursiveTask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyRecursiveTask action1 = new MyRecursiveTask();
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask task = pool.submit(action1);
        System.out.println(task.isCompletedAbnormally() + " "
                + task.isCompletedNormally());
        Thread.sleep(2000);
        System.out.println(task.isCompletedAbnormally() + " "
                + task.isCompletedNormally());
        System.out.println(task.getException());
    }
}
/*
false false
java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p149forkjointask_method2.mytask.MyRecursiveTask.compute(MyRecursiveTask.java:11)
	at com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p149forkjointask_method2.mytask.MyRecursiveTask.compute(MyRecursiveTask.java:5)
	at java.util.concurrent.RecursiveTask.exec(RecursiveTask.java:94)
	at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
	at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1056)
	at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1692)
	at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:157)
true false
java.lang.NumberFormatException

Process finished with exit code 0
 */