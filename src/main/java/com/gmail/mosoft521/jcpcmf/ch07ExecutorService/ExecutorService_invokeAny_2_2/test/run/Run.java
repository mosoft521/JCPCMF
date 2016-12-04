package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.ExecutorService_invokeAny_2_2.test.run;

import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.ExecutorService_invokeAny_2_2.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.ExecutorService_invokeAny_2_2.mycallable.MyCallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Run {

    public static void main(String[] args) {

        try {
            ThreadPoolExecutor abc;

            List<Callable<String>> list = new ArrayList<>();
            list.add(new MyCallableA());
            list.add(new MyCallableB());

            ExecutorService executor = Executors.newCachedThreadPool();
            System.out.println(executor);
            String getValueA = executor.invokeAny(list);
            System.out.println("============" + getValueA);
            System.out.println("ZZZZZZZZZZZZZZZZ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
/*
...
MyCallableA 123455
MyCallableA 123456
MyCallableA   end 1480822332359
============returnA
ZZZZZZZZZZZZZZZZ

Process finished with exit code 1
 */