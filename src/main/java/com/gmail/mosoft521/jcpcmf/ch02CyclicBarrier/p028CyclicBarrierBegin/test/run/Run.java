package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p028CyclicBarrierBegin.test.run;

import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p028CyclicBarrierBegin.extthread.MyThread;

import java.util.concurrent.CyclicBarrier;

public class Run {

    public static void main(String[] args) {
        CyclicBarrier cbRef = new CyclicBarrier(5, new Runnable() {
            public void run() {
                System.out.println("全都到了！");
            }
        });
        MyThread[] threadArray = new MyThread[5];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(cbRef);
        }
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].start();
        }
    }
}
/*
Thread-4 到了! 1480752866462
Thread-2 到了! 1480752866490
Thread-3 到了! 1480752866723
Thread-0 到了! 1480752866730
Thread-1 到了! 1480752867027
全都到了！
 */