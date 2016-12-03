package com.gmail.mosoft521.jcpcmf.ch04Executor.p057Executors_3.test.run;

import com.gmail.mosoft521.jcpcmf.ch04Executor.p057Executors_3.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.execute(new MyRunnable(("" + (i + 1))));
        }
        for (int i = 0; i < 3; i++) {
            executorService.execute(new MyRunnable(("" + (i + 1))));
        }

    }
}
/*
pool-1-thread-1 username=1 begin 1480768490662
pool-1-thread-3 username=3 begin 1480768490662
pool-1-thread-2 username=2 begin 1480768490662
pool-1-thread-3 username=3   end 1480768492662
pool-1-thread-2 username=2   end 1480768492662
pool-1-thread-3 username=1 begin 1480768492662
pool-1-thread-1 username=1   end 1480768492662
pool-1-thread-2 username=2 begin 1480768492662
pool-1-thread-1 username=3 begin 1480768492662
pool-1-thread-3 username=1   end 1480768494662
pool-1-thread-2 username=2   end 1480768494662
pool-1-thread-1 username=3   end 1480768494662

Process finished with exit code 1
 */