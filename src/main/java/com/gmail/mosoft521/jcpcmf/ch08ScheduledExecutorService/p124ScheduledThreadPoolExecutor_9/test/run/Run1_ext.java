package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p124ScheduledThreadPoolExecutor_9.test.run;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p124ScheduledThreadPoolExecutor_9.mycallable.MyRunnable;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run1_ext {
    public static void main(String[] args) throws InterruptedException {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
                10);
        Runnable runnable1 = new MyRunnable("A");
        ScheduledFuture future = executor.schedule(runnable1, 0,
                TimeUnit.SECONDS);
        Thread.sleep(2000);
        BlockingQueue<Runnable> queue = executor.getQueue();
        System.out.println("A处size()=" + queue.size());
        System.out.println("取消结果为：" + future.cancel(true));
        queue = executor.getQueue();
        System.out.println("B处size()=" + queue.size());
        System.out.println("main end!");
    }
}
/*
main run
run! username=A pool-1-thread-1
run! username=A pool-1-thread-1
A处size()=0
取消结果为：true
B处size()=0
main end!
java.lang.InterruptedException: sleep interrupted
	at java.lang.Thread.sleep(Native Method)
	at com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p124ScheduledThreadPoolExecutor_9.mycallable.MyRunnable.run(MyRunnable.java:30)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:180)
	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:293)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)
中断了！
Process finished with exit code 1
 */