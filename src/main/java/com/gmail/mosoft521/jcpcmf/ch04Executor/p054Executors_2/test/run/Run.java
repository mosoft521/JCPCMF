package com.gmail.mosoft521.jcpcmf.ch04Executor.p054Executors_2.test.run;

import com.gmail.mosoft521.jcpcmf.ch04Executor.p054Executors_2.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new MyRunnable(("" + (i + 1))));
        }
    }
}
/*
pool-1-thread-1 username=1 begin 1480768140796
pool-1-thread-2 username=2 begin 1480768140797
pool-1-thread-4 username=4 begin 1480768140797
pool-1-thread-5 username=5 begin 1480768140797
pool-1-thread-3 username=3 begin 1480768140798
pool-1-thread-7 username=7 begin 1480768140798
pool-1-thread-6 username=6 begin 1480768140798
pool-1-thread-9 username=9 begin 1480768140799
pool-1-thread-8 username=8 begin 1480768140799
pool-1-thread-10 username=10 begin 1480768140800
pool-1-thread-1 username=1   end 1480768142797
pool-1-thread-5 username=5   end 1480768142797
pool-1-thread-2 username=2   end 1480768142797
pool-1-thread-4 username=4   end 1480768142797
pool-1-thread-6 username=6   end 1480768142798
pool-1-thread-3 username=3   end 1480768142798
pool-1-thread-7 username=7   end 1480768142798
pool-1-thread-9 username=9   end 1480768142799
pool-1-thread-8 username=8   end 1480768142799
pool-1-thread-10 username=10   end 1480768142800
Process finished with exit code 1
 */