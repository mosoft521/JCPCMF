package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p033CyclicBarrier_run3.test.run;

import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p033CyclicBarrier_run3.extthread.MyThreadA;
import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p033CyclicBarrier_run3.extthread.MyThreadB;
import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p033CyclicBarrier_run3.service.MyService;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.start();
        MyThreadB b = new MyThreadB(service);
        b.start();
    }
}
/*
Thread-0 准备！1480754513247
Thread-0执行了cyclicBarrier.await(5, TimeUnit.SECONDS)
Thread-1 准备！1480754513247
Thread-1执行了cyclicBarrier.await()
java.util.concurrent.BrokenBarrierException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:250)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:362)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p033CyclicBarrier_run3.service.MyService.testMethod(MyService.java:28)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p033CyclicBarrier_run3.extthread.MyThreadB.run(MyThreadB.java:16)
java.util.concurrent.TimeoutException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:257)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:435)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p033CyclicBarrier_run3.service.MyService.testMethod(MyService.java:24)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p033CyclicBarrier_run3.extthread.MyThreadA.run(MyThreadA.java:16)
Thread-0 进入catch (TimeoutException e)
Thread-1 进入catch (BrokenBarrierException e)
 */