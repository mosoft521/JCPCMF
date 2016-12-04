package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p035CyclicBarrier_run5.test.run;

import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p035CyclicBarrier_run5.extthread.MyThreadA;
import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p035CyclicBarrier_run5.extthread.MyThreadB;
import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p035CyclicBarrier_run5.service.MyService;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.setName("A");
        MyThreadB b = new MyThreadB(service);
        b.setName("B");
        // 线程C未实例化
        a.start();
        b.start();
        Thread.sleep(2000);
        service.cyclicBarrier.reset();
    }
}
/*
A 准备！1480754742007
B 准备！1480754742007
java.util.concurrent.BrokenBarrierException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:250)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:362)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p035CyclicBarrier_run5.service.MyService.testMethod(MyService.java:20)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p035CyclicBarrier_run5.extthread.MyThreadA.run(MyThreadA.java:16)
java.util.concurrent.BrokenBarrierException
	at java.util.concurrent.CyclicBarrier.dowait(CyclicBarrier.java:250)
	at java.util.concurrent.CyclicBarrier.await(CyclicBarrier.java:362)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p035CyclicBarrier_run5.service.MyService.testMethod(MyService.java:20)
	at com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p035CyclicBarrier_run5.extthread.MyThreadB.run(MyThreadB.java:16)
Process finished with exit code 0
 */