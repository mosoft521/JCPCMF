package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.test.run;

import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.mycallable.MyCallableB;

import java.util.concurrent.CompletionService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

public class Run4 {

    public static void main(String[] args) {
        try {
            MyCallableA callableA = new MyCallableA();
            MyCallableB callableB = new MyCallableB();

            Executor executor = Executors.newSingleThreadExecutor();
            CompletionService csRef = new ExecutorCompletionService(executor);
            csRef.submit(callableA);
            csRef.submit(callableB);

            for (int i = 0; i < 2; i++) {
                System.out.println("zzzzzzzzzzzz" + " " + csRef.poll());
            }
            Thread.sleep(6000);
            System.out.println("A处" + " " + csRef.poll());
            System.out.println("B处" + " " + csRef.poll());
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
zzzzzzzzzzzz null
zzzzzzzzzzzz null
MyCallableA begin 1480818897938
MyCallableA   end 1480818898938
MyCallableB begin 1480818898938
A处 java.util.concurrent.FutureTask@677327b6
B处 java.util.concurrent.FutureTask@14ae5a5
main end!

Process finished with exit code 1
 */