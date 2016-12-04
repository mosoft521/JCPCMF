package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p102test3.test;

import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p102test3.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p102test3.mycallable.MyCallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
    public static void main(String[] args) {
        try {
            List<Callable<String>> list = new ArrayList<Callable<String>>();
            list.add(new MyCallableA());
            list.add(new MyCallableB());
            ExecutorService service = Executors.newCachedThreadPool();
            String getString = service.invokeAny(list);
            System.out.println("zzzz=" + getString);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
/*
...
MyCallableA 在运行中=123454
MyCallableA 在运行中=123455
MyCallableA 在运行中=123456
MyCallableA pool-1-thread-1   end 1480820957265
zzzz=returnA
Process finished with exit code 1
 */