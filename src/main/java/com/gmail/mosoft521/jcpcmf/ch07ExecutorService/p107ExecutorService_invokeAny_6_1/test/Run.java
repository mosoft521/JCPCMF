package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p107ExecutorService_invokeAny_6_1.test;

import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p107ExecutorService_invokeAny_6_1.mycallable.MyCallableA;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Run {
    public static void main(String[] args) {
        try {
            List<Callable<String>> list = new ArrayList();
            list.add(new MyCallableA());
            ExecutorService service = Executors.newCachedThreadPool();
            String getString = service.invokeAny(list, 1, TimeUnit.SECONDS);
            System.out.println("zzzz=" + getString);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("mainA");
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println("mainB");
        } catch (TimeoutException e) {
            e.printStackTrace();
            System.out.println("mainC");
        }
    }
}
/*
...
MyCallableA 在运行中=63736
MyCallableA 在运行中=63737
xxxxxxxx=中断了
java.lang.NullPointerException
	at com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p107ExecutorService_invokeAny_6_1.mycallable.MyCallableA.call(MyCallableA.java:23)
	at com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p107ExecutorService_invokeAny_6_1.mycallable.MyCallableA.call(MyCallableA.java:5)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)
java.util.concurrent.TimeoutException
	at java.util.concurrent.AbstractExecutorService.doInvokeAny(AbstractExecutorService.java:184)
	at java.util.concurrent.AbstractExecutorService.invokeAny(AbstractExecutorService.java:225)
	at com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p107ExecutorService_invokeAny_6_1.test.Run.main(Run.java:23)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
null 通过显式try-catch捕获异常了
mainC
Process finished with exit code 1
 */