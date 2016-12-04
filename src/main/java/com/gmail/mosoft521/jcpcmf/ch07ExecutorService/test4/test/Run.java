package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.test4.test;

import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.test4.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.test4.mycallable.MyCallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
    public static void main(String[] args) {
        try {
            List<Callable<String>> list = new ArrayList<>();
            list.add(new MyCallableA());
            list.add(new MyCallableB());
            ExecutorService service = Executors.newCachedThreadPool();
            String getString = service.invokeAny(list);
            System.out.println("zzzz=" + getString);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("mainA");
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println("mainB");
        }
    }
}
/*
...
MyCallableA 在运行中=123454
MyCallableA 在运行中=123455
MyCallableA 在运行中=123456
MyCallableA pool-1-thread-1   end 1480822246430
zzzz=returnA
Process finished with exit code 1
 */