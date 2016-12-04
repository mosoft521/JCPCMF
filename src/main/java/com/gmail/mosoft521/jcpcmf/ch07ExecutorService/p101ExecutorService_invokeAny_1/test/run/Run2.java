package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p101ExecutorService_invokeAny_1.test.run;

import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p101ExecutorService_invokeAny_1.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p101ExecutorService_invokeAny_1.mycallable.MyCallableB2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run2 {

    public static void main(String[] args) {
        try {
            List<Callable<String>> list = new ArrayList<Callable<String>>();
            list.add(new MyCallableA());
            list.add(new MyCallableB2());

            ExecutorService executor = Executors.newCachedThreadPool();
            // invokeAny只取得最先完成任务的结果值
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
MyCallableA 123450
MyCallableA 123451
MyCallableA 123452
MyCallableA 123453
MyCallableA 123454
MyCallableA 123455
MyCallableA 123456
MyCallableA   end 1480820831290
============returnA
ZZZZZZZZZZZZZZZZ
MyCallableB 53164
***********抛出异常中断了

Process finished with exit code 1
 */