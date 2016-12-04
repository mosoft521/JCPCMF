package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p018RepastTest.test.run;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p018RepastTest.extthread.ThreadC;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p018RepastTest.extthread.ThreadP;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p018RepastTest.service.RepastService;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        RepastService service = new RepastService();
        ThreadP[] arrayP = new ThreadP[10];
        ThreadC[] arrayC = new ThreadC[10];
        for (int i = 0; i < 10; i++) {
            arrayP[i] = new ThreadP(service);
            arrayC[i] = new ThreadC(service);
        }
        Thread.sleep(2000);
        for (int i = 0; i < 10; i++) {
            arrayP[i].start();
            arrayC[i].start();
        }
    }
}
/*
Thread-0 生产了 数据
Thread-9 消费了 数据
Thread-10 生产了 数据
Thread-11 消费了 数据
Thread-14 生产了 数据
Thread-1 消费了 数据
Thread-2 生产了 数据
Thread-4 生产了 数据
Thread-17 消费了 数据
Thread-19 消费了 数据
Thread-6 生产了 数据
Thread-7 消费了 数据
Thread-8 生产了 数据
Thread-12 生产了 数据
Thread-13 消费了 数据
Thread-16 生产了 数据
Thread-15 消费了 数据
Thread-3 消费了 数据
Thread-18 生产了 数据
Thread-5 消费了 数据
 */