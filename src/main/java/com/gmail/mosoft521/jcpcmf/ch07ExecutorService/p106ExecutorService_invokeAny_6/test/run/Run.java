package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p106ExecutorService_invokeAny_6.test.run;

import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p106ExecutorService_invokeAny_6.mycallable.MyCallableA;

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
            MyCallableA a = new MyCallableA();
            List<Callable<String>> callableList = new ArrayList();
            callableList.add(a);
            ExecutorService service = Executors.newCachedThreadPool();
            String getValue = service.invokeAny(callableList, 1,
                    TimeUnit.SECONDS);
            System.out.println("=============" + getValue);
            System.out.println("zzzzzzzzzzzzzzzz");
        } catch (InterruptedException e) {
            System.out.println("进入catch InterruptedException");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("进入catch ExecutionException");
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("进入catch TimeoutException 超时了");
            e.printStackTrace();
        }
    }
}
/*
...
MyCallableA i=193454
MyCallableA i=193455
MyCallableA i=193456
MyCallableA   end 1480821401479
java.util.concurrent.TimeoutException
	at java.util.concurrent.AbstractExecutorService.doInvokeAny(AbstractExecutorService.java:184)
	at java.util.concurrent.AbstractExecutorService.invokeAny(AbstractExecutorService.java:225)
	at com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p106ExecutorService_invokeAny_6.test.run.Run.main(Run.java:25)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
进入catch TimeoutException 超时了
Process finished with exit code 1
 */