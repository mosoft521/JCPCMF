package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p029CyclicBarrierThreadBigParties.test;

import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p029CyclicBarrierThreadBigParties.extthread.ThreadA;

import java.util.concurrent.CyclicBarrier;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cbRef = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("全来了！");
            }
        });
        for (int i = 0; i < 4; i++) {
            ThreadA threadA1 = new ThreadA(cbRef);
            threadA1.start();
            Thread.sleep(2000);
        }
    }
}
/*
Thread-0 begin =1480752959193 等待凑齐2个继续运行
Thread-1 begin =1480752961192 等待凑齐2个继续运行
全来了！
Thread-1   end =1480752961192 已经凑齐2个继续运行
Thread-0   end =1480752961192 已经凑齐2个继续运行
Thread-2 begin =1480752963192 等待凑齐2个继续运行
Thread-3 begin =1480752965192 等待凑齐2个继续运行
全来了！
Thread-3   end =1480752965192 已经凑齐2个继续运行
Thread-2   end =1480752965192 已经凑齐2个继续运行
 */