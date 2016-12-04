package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p108ExecutorService_invokeAll_1.test;

import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p108ExecutorService_invokeAll_1.extthread.CallableA;
import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p108ExecutorService_invokeAll_1.extthread.CallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Run {

    public static void main(String[] args) {

        try {
            CallableA callableA = new CallableA();
            CallableB callableB = new CallableB();

            List<Callable<String>> list = new ArrayList<Callable<String>>();
            list.add(callableA);
            list.add(callableB);

            ExecutorService service = Executors.newCachedThreadPool();
            System.out.println("invokeAll begin " + System.currentTimeMillis());
            List<Future<String>> listFuture = service.invokeAll(list);
            System.out.println("invokeAll   end " + System.currentTimeMillis());
            for (int i = 0; i < listFuture.size(); i++) {
                System.out.println("返回的结果=" + listFuture.get(i).get() + " "
                        + System.currentTimeMillis());
            }
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
invokeAll begin 1480821631571
pool-1-thread-2 begin 1480821631573
pool-1-thread-1 begin 1480821631573
pool-1-thread-1   end 1480821636573
pool-1-thread-2   end 1480821639573
invokeAll   end 1480821639573
返回的结果=returnA 1480821639573
返回的结果=returnB 1480821639573

Process finished with exit code 1

 */