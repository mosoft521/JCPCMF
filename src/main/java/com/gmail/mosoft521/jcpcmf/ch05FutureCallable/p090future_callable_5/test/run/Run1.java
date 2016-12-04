package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p090future_callable_5.test.run;

import com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p090future_callable_5.mycallable.MyCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Run1 {

    public static void main(String[] args) {
        try {
            MyCallable callable = new MyCallable();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5L,
                    TimeUnit.SECONDS, new LinkedBlockingDeque());
            System.out.println("begin " + System.currentTimeMillis());
            Future<String> future = executor.submit(callable);
            System.out.println("返回值" + future.get(5, TimeUnit.SECONDS));
            System.out.println("  end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            System.out.println("进入catch InterruptedException");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("进入catch ExecutionException");
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("进入catch TimeoutException");
            e.printStackTrace();
        }
    }
}
/*
begin 1480817123841
进入catch TimeoutException
java.util.concurrent.TimeoutException
	at java.util.concurrent.FutureTask.get(FutureTask.java:205)
	at com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p090future_callable_5.test.run.Run1.main(Run1.java:21)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

Process finished with exit code 1
 */