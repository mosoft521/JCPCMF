package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p096ExecutorCompletionService_1.test.run;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {

    public static void main(String[] args) {
        try {
            // take方法：获取并移除表示下一个已完成任务的 Future，如果目前不存在这样的任务，则等待。
            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(
                    executorService);
            for (int i = 0; i < 10; i++) {
                csRef.submit(new Callable<String>() {
                    public String call() throws Exception {
                        long sleepValue = (int) (Math.random() * 1000);
                        System.out.println("sleep=" + sleepValue + " "
                                + Thread.currentThread().getName());
                        Thread.sleep(sleepValue);
                        return "Alvin：" + sleepValue + " "
                                + Thread.currentThread().getName();
                    }
                });
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(csRef.take().get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
/*
sleep=359 pool-1-thread-1
sleep=234 pool-1-thread-4
sleep=410 pool-1-thread-10
sleep=856 pool-1-thread-3
sleep=177 pool-1-thread-6
sleep=347 pool-1-thread-5
sleep=30 pool-1-thread-7
sleep=372 pool-1-thread-2
sleep=349 pool-1-thread-9
sleep=122 pool-1-thread-8
Alvin：30 pool-1-thread-7
Alvin：122 pool-1-thread-8
Alvin：177 pool-1-thread-6
Alvin：234 pool-1-thread-4
Alvin：359 pool-1-thread-1
Alvin：347 pool-1-thread-5
Alvin：349 pool-1-thread-9
Alvin：372 pool-1-thread-2
Alvin：410 pool-1-thread-10
Alvin：856 pool-1-thread-3

Process finished with exit code 1

 */