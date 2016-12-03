package com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p024CountDownLatch_test2.test.run;

import com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p024CountDownLatch_test2.extthread.MyThread;
import com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p024CountDownLatch_test2.service.MyService;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThread[] tArray = new MyThread[10];
        for (int i = 0; i < tArray.length; i++) {
            tArray[i] = new MyThread(service);
            tArray[i].setName("线程" + (i + 1));
            tArray[i].start();
        }
        Thread.sleep(2000);
        service.downMethod();
    }
}
/*
线程1准备
线程2准备
线程3准备
线程4准备
线程6准备
线程5准备
线程7准备
线程8准备
线程9准备
线程10准备
开始
线程1结束
线程2结束
线程5结束
线程10结束
线程9结束
线程8结束
线程7结束
线程6结束
线程3结束
线程4结束
 */