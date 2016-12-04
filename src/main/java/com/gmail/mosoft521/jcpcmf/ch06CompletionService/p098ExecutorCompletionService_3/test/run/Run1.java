package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p098ExecutorCompletionService_3.test.run;

import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p098ExecutorCompletionService_3.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p098ExecutorCompletionService_3.mycallable.MyCallableB;

import java.util.concurrent.CompletionService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

public class Run1 {
    public static void main(String[] args) {
        MyCallableA callableA = new MyCallableA();
        MyCallableB callableB = new MyCallableB();
        Executor executor = Executors.newCachedThreadPool();
        CompletionService csRef = new ExecutorCompletionService(executor);
        csRef.submit(callableA);
        csRef.submit(callableB);
        for (int i = 0; i < 2; i++) {
            System.out.println("zzzzzzzzzzzz" + " " + csRef.poll());
        }
        System.out.println("main end!");
    }
}
/*
zzzzzzzzzzzz null
zzzzzzzzzzzz null
main end!
MyCallableA 1480818525340
MyCallableB 1480818530340
Process finished with exit code 1
 */