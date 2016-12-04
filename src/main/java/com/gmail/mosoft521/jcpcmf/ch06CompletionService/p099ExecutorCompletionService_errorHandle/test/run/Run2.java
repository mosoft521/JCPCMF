package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.test.run;

import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.mycallable.MyCallableB;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Run2 {
    public static void main(String[] args) {
        try {
            MyCallableA callableA = new MyCallableA();
            MyCallableB callableB = new MyCallableB();
            Executor executor = Executors.newSingleThreadExecutor();
            CompletionService csRef = new ExecutorCompletionService(executor);
            csRef.submit(callableA);// 先执行的A
            csRef.submit(callableB);// 后执行的B
            for (int i = 0; i < 2; i++) {
                System.out.println("zzzzzzzzzzzz" + " " + csRef.take().get());
            }
            System.out.println("main end!");
            FutureTask abc;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
/*
MyCallableA begin 1480818815740
MyCallableA   end 1480818816751
MyCallableB begin 1480818816752
zzzzzzzzzzzz returnA
java.util.concurrent.ExecutionException: java.lang.Exception: 抛出异常！
	at java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.util.concurrent.FutureTask.get(FutureTask.java:192)
	at com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.test.run.Run2.main(Run2.java:26)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Caused by: java.lang.Exception: 抛出异常！
	at com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.mycallable.MyCallableB.call(MyCallableB.java:12)
	at com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.mycallable.MyCallableB.call(MyCallableB.java:5)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)
Process finished with exit code 1
 */