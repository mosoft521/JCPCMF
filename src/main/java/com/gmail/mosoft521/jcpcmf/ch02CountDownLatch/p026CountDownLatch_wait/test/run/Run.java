package com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p026CountDownLatch_wait.test.run;

import com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p026CountDownLatch_wait.extthread.MyThread;
import com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p026CountDownLatch_wait.service.MyService;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThread[] threadArray = new MyThread[3];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(service);
        }
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].start();
        }
    }
}
/*
Thread-0 准备 1480752558327
Thread-1 准备 1480752558327
Thread-2 准备 1480752558335
Thread-1 结束 1480752561330
Thread-0 结束 1480752561330
Thread-2 结束 1480752561337
 */