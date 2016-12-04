package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p112test10_update_2.test.run;

import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p112test10_update_2.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p112test10_update_2.mycallable.MyCallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Run {

    public static void main(String[] args) {
        try {
            MyCallableA a = new MyCallableA();
            MyCallableB b = new MyCallableB();

            List<Callable<String>> callableList = new ArrayList<Callable<String>>();
            callableList.add(a);
            callableList.add(b);

            ExecutorService service = Executors.newCachedThreadPool();
            System.out.println("X " + System.currentTimeMillis());
            List<Future<String>> listFuture = service.invokeAll(callableList,
                    2, TimeUnit.SECONDS);
            System.out.println("Y " + System.currentTimeMillis());
            for (int i = 0; i < listFuture.size(); i++) {
                System.out.println("for 第" + (i + 1) + "次循环");
                System.out.println(listFuture.get(i).get());
            }
            System.out.println("Z " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            System.out.println("进入catch InterruptedException");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("进入catch ExecutionException");
            e.printStackTrace();
        }
    }
}
/*
...
MyCallableB i=223454
MyCallableB i=223455
MyCallableB i=223456
MyCallableB   end 1480822048268

Process finished with exit code 1
 */