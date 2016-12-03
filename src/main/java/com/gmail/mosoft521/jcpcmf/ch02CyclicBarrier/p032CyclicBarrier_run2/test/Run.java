package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.test;

import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.extthread.MyThread;
import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service.MyService;

import java.util.concurrent.CyclicBarrier;

public class Run {

    public static void main(String[] args) {
        int parties = 4;
        CyclicBarrier cbRef = new CyclicBarrier(parties, new Runnable() {
            public void run() {
                System.out.println("都到了！");
            }
        });

        MyService myService = new MyService(cbRef);

        MyThread[] threadArray = new MyThread[4];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(myService);
            threadArray[i].start();
        }
    }
}
/*
①
Thread-0 到了 在等待其它人都到了开始起跑
Thread-1 到了 在等待其它人都到了开始起跑
Thread-2 到了 在等待其它人都到了开始起跑
thread-2进来了
Thread-3 到了 在等待其它人都到了开始起跑
Exception in thread "Thread-2" java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service.MyService.beginRun(MyService.java:22)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service.MyService.testA(MyService.java:43)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.extthread.MyThread.run(MyThread.java:16)

②
Thread-0 到了 在等待其它人都到了开始起跑
Thread-3 到了 在等待其它人都到了开始起跑
Thread-2 到了 在等待其它人都到了开始起跑
thread-2进来了
Thread-1 到了 在等待其它人都到了开始起跑
进入了InterruptedException e true
进入了BrokenBarrierException e true
进入了BrokenBarrierException e true
进入了BrokenBarrierException e true
java.util.concurrent.BrokenBarrierException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:250)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:362)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service.MyService.beginRun(MyService.java:24)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service.MyService.testA(MyService.java:42)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.extthread.MyThread.run(MyThread.java:16)
java.lang.InterruptedException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:211)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:362)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service.MyService.beginRun(MyService.java:24)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service.MyService.testA(MyService.java:42)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.extthread.MyThread.run(MyThread.java:16)
java.util.concurrent.BrokenBarrierException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:250)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:362)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service.MyService.beginRun(MyService.java:24)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service.MyService.testA(MyService.java:42)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.extthread.MyThread.run(MyThread.java:16)
java.util.concurrent.BrokenBarrierException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:250)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:362)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service.MyService.beginRun(MyService.java:24)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service.MyService.testA(MyService.java:42)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.extthread.MyThread.run(MyThread.java:16)
 */