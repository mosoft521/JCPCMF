package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p116ScheduledThreadPoolExecutor_3.test.run;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p116ScheduledThreadPoolExecutor_3.mycallable.MyCallableA;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Run {
    public static void main(String[] args) {
        try {
            List<Callable> callableList = new ArrayList();
            callableList.add(new MyCallableA());
            ScheduledExecutorService executor = Executors
                    .newSingleThreadScheduledExecutor();
            System.out.println("          X=" + System.currentTimeMillis());
            ScheduledFuture<String> futureA = executor.schedule(callableList
                    .get(0), 4L, TimeUnit.SECONDS);
            System.out.println(futureA.get() + "   A="
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
/*
          X=1480823177916
a call run =1480823181918
returnA   A=1480823181918
Process finished with exit code 1
 */