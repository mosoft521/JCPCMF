package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p147method16.mytask;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveTask1 extends RecursiveAction {
    protected void compute() {
        try {
            System.out.println("begin=" + Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("  end=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
