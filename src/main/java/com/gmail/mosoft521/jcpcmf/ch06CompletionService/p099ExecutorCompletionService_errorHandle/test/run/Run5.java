package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.test.run;

import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.mycallable.MyCallableB;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

public class Run5 {
    public static void main(String[] args) {
        try {
            MyCallableA callableA = new MyCallableA();
            MyCallableB callableB = new MyCallableB();
            Executor executor = Executors.newSingleThreadExecutor();
            CompletionService csRef = new ExecutorCompletionService(executor);
            csRef.submit(callableA);// 先执行A
            csRef.submit(callableB);// 后执行B
            for (int i = 0; i < 2; i++) {
                System.out.println("zzzzzzzzzzzz" + " " + csRef.poll());
            }
            Thread.sleep(6000);
            System.out.println("A处" + " " + csRef.poll().get());
            System.out.println("B处" + " " + csRef.poll().get());
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
/*
zzzzzzzzzzzz null
zzzzzzzzzzzz null
MyCallableA begin 1480818938647
MyCallableA   end 1480818939647
MyCallableB begin 1480818939647
A处 returnA
Exception in thread "main" java.lang.NullPointerException
	at com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.test.run.Run5.main(Run5.java:29)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Process finished with exit code 1
 */