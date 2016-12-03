package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p032CyclicBarrier_run2.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyService {

    private CyclicBarrier cbRef;

    public MyService(CyclicBarrier cbRef) {
        super();
        this.cbRef = cbRef;
    }

    private void beginRun(int count) {
        try {
            System.out.println(Thread.currentThread().getName()
                    + " 到了 在等待其它人都到了开始起跑");
            if (Thread.currentThread().getName().equals("Thread-2")) {
                System.out.println("thread-2进来了");
                Thread.sleep(5000);
                //Integer.parseInt("a");
                Thread.currentThread().interrupt();
            }
            cbRef.await();
            System.out.println("都到了，开始跑!");
            System.out.println(Thread.currentThread().getName() + " 到达终点，并结束第"
                    + count + "赛段");
        } catch (InterruptedException e) {
            System.out.println("进入了InterruptedException e " + cbRef.isBroken());
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println("进入了BrokenBarrierException e "
                    + cbRef.isBroken());
            e.printStackTrace();
        }

    }

    public void testA() {
        // 比赛1个赛段
        for (int i = 0; i < 1; i++) {
            beginRun(i + 1);
        }
    }
}