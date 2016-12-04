package com.gmail.mosoft521.jcpcmf.ch04Executor.p053Executors_1.test.run;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Runnable1 begin "
                            + System.currentTimeMillis());
                    Thread.sleep(1000);
                    System.out.println("A");
                    System.out.println("Runnable1   end "
                            + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Runnable2 begin "
                            + System.currentTimeMillis());
                    Thread.sleep(1000);
                    System.out.println("B");
                    System.out.println("Runnable2   end "
                            + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }
}
/*
Runnable1 begin 1480768000500
Runnable2 begin 1480768000500
B
A
Runnable2   end 1480768001500
Runnable1   end 1480768001500
 */