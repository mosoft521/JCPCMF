package com.gmail.mosoft521.jcpcmf.ch04Executor.p055Executors_2_1.test.run;

import com.gmail.mosoft521.jcpcmf.ch04Executor.p055Executors_2_1.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable(("" + (i + 1))));
        }
        Thread.sleep(1000);
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable(("" + (i + 1))));
        }
    }
}
/*
pool-1-thread-1 username=1 begin 1480768205465
pool-1-thread-1 username=1   end 1480768205465
pool-1-thread-2 username=2 begin 1480768205466
pool-1-thread-2 username=2   end 1480768205466
pool-1-thread-2 username=5 begin 1480768205466
pool-1-thread-1 username=4 begin 1480768205466
pool-1-thread-2 username=5   end 1480768205466
pool-1-thread-1 username=4   end 1480768205466
pool-1-thread-3 username=3 begin 1480768205467
pool-1-thread-3 username=3   end 1480768205467

pool-1-thread-2 username=3 begin 1480768206466
pool-1-thread-2 username=3   end 1480768206466
pool-1-thread-3 username=1 begin 1480768206466
pool-1-thread-3 username=1   end 1480768206466
pool-1-thread-1 username=2 begin 1480768206466
pool-1-thread-1 username=2   end 1480768206466
pool-1-thread-1 username=5 begin 1480768206467
pool-1-thread-1 username=5   end 1480768206467
pool-1-thread-4 username=4 begin 1480768206467
pool-1-thread-4 username=4   end 1480768206467
Process finished with exit code 1
 */