package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p114ScheduledThreadPoolExecutor_1.test.run;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p114ScheduledThreadPoolExecutor_1.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p114ScheduledThreadPoolExecutor_1.mycallable.MyCallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Run1 {
    public static void main(String[] args) {
        try {
            List<Callable> callableList = new ArrayList();
            callableList.add(new MyCallableA());
            callableList.add(new MyCallableB());
            // 调用方法newSingleThreadScheduledExecutor
            // 取得一个单任务的计划任务执行池
            ScheduledExecutorService executor = Executors
                    .newSingleThreadScheduledExecutor();
            ScheduledFuture<String> futureA = executor.schedule(callableList
                    .get(0), 4L, TimeUnit.SECONDS);
            ScheduledFuture<String> futureB = executor.schedule(callableList
                    .get(1), 4L, TimeUnit.SECONDS);
            System.out.println("          X=" + System.currentTimeMillis());
            System.out.println("返回值A：" + futureA.get());
            System.out.println("返回值B：" + futureB.get());
            System.out.println("          Y=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
/*
          X=1480822986326
callA begin pool-1-thread-1 1480822990327
callA   end pool-1-thread-1 1480822993328
返回值A：returnA
callB begin pool-1-thread-1 1480822993328
callB   end pool-1-thread-1 1480822993328
返回值B：returnB
          Y=1480822993328

Process finished with exit code 1

 */