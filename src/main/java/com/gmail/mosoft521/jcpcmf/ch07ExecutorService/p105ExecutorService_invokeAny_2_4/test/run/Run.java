package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p105ExecutorService_invokeAny_2_4.test.run;

import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p105ExecutorService_invokeAny_2_4.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p105ExecutorService_invokeAny_2_4.mycallable.MyCallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {

    public static void main(String[] args) {
        try {
            List<Callable<String>> list = new ArrayList();
            list.add(new MyCallableA());
            list.add(new MyCallableB());

            ExecutorService executor = Executors.newCachedThreadPool();
            System.out.println(executor);
            String getValueA = executor.invokeAny(list);
            System.out.println("返回值" + getValueA);
            System.out.println("mainEND");
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
MyCallableB 123455
MyCallableB 123456
MyCallableB   end 1480821297734
1==1
进入catch ExecutionException
java.util.concurrent.ExecutionException: java.lang.Exception: 报错了BBBBB
	at java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.util.concurrent.FutureTask.get(FutureTask.java:192)
	at java.util.concurrent.AbstractExecutorService.doInvokeAny(AbstractExecutorService.java:193)
	at java.util.concurrent.AbstractExecutorService.invokeAny(AbstractExecutorService.java:215)
	at com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p105ExecutorService_invokeAny_2_4.test.run.Run.main(Run.java:23)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Caused by: java.lang.Exception: 报错了BBBBB
	at com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p105ExecutorService_invokeAny_2_4.mycallable.MyCallableB.call(MyCallableB.java:18)
	at com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p105ExecutorService_invokeAny_2_4.mycallable.MyCallableB.call(MyCallableB.java:5)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)

Process finished with exit code 1
 */