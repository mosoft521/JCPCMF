package com.gmail.mosoft521.jcpcmf.ch04Executor.p059Executors_4.test.run;

import com.gmail.mosoft521.jcpcmf.ch04Executor.p059Executors_4.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 3; i++) {
            executorService.execute(new MyRunnable(("" + (i + 1))));
        }
    }
}
/*
pool-1-thread-1 username=1 begin 1480768641890
pool-1-thread-1 username=1   end 1480768643890
pool-1-thread-1 username=2 begin 1480768643890
pool-1-thread-1 username=2   end 1480768645890
pool-1-thread-1 username=3 begin 1480768645890
pool-1-thread-1 username=3   end 1480768647890
Process finished with exit code 1
 */