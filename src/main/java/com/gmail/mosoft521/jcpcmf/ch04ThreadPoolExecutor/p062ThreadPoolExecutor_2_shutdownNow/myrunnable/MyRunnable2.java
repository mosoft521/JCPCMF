package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p062ThreadPoolExecutor_2_shutdownNow.myrunnable;

public class MyRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE / 1000; i++) {
            new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
        }
        System.out.println("任务成功完成！");
    }
}