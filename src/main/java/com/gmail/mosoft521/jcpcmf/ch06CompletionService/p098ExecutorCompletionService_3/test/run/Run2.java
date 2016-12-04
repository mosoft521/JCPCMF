package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p098ExecutorCompletionService_3.test.run;

import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p098ExecutorCompletionService_3.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p098ExecutorCompletionService_3.mycallable.MyCallableB;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Run2 {

    public static void main(String[] args) {

        try {
            MyCallableA callableA = new MyCallableA();
            MyCallableB callableB = new MyCallableB();

            Executor executor = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(executor);
            csRef.submit(callableA);
            csRef.submit(callableB);

            for (int i = 0; i < 2; i++) {
                System.out.println("zzzzzzzzzzzz" + " "
                        + csRef.poll(6, TimeUnit.SECONDS).get());
                System.out.println("X");
            }
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
/*
MyCallableA 1480818554851
zzzzzzzzzzzz returnA
X
MyCallableB 1480818559852
zzzzzzzzzzzz returnB
X
main end!

Process finished with exit code 1
 */