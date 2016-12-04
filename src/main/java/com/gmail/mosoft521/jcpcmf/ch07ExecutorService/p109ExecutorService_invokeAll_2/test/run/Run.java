package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p109ExecutorService_invokeAll_2.test.run;

import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p109ExecutorService_invokeAll_2.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p109ExecutorService_invokeAll_2.mycallable.MyCallableB;

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
            List<Callable<String>> list = new ArrayList();
            list.add(new MyCallableA());
            list.add(new MyCallableB());

            ExecutorService executor = Executors.newCachedThreadPool();
            System.out.println("Y=" + System.currentTimeMillis());
            List<Future<String>> listFuture = executor.invokeAll(list);
            System.out.println("Z=" + System.currentTimeMillis());
            for (int i = 0; i < listFuture.size(); i++) {
                System.out.println("result=" + listFuture.get(i).get());
            }
            System.out.println("mainEND");
        } catch (InterruptedException e) {
            System.out.println("报错了InterruptedException");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("报错了ExecutionException");
            e.printStackTrace();
        }
    }
}
/*
...
MyCallableA 123454
MyCallableA 123455
MyCallableA 123456
MyCallableA   end 1480821762565
Z=1480821762565
result=returnA
报错了ExecutionException
java.util.concurrent.ExecutionException: java.lang.Exception: 出现异常
	at java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.util.concurrent.FutureTask.get(FutureTask.java:192)
	at com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p109ExecutorService_invokeAll_2.test.run.Run.main(Run.java:28)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Caused by: java.lang.Exception: 出现异常
	at com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p109ExecutorService_invokeAll_2.mycallable.MyCallableB.call(MyCallableB.java:18)
	at com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p109ExecutorService_invokeAll_2.mycallable.MyCallableB.call(MyCallableB.java:5)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)

Process finished with exit code 1
 */