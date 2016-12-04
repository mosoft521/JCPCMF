package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p091future_callable_6.test.run;

import com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p091future_callable_6.extcallable.MyCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Run {
    public static void main(String[] args) {
        try {
            MyCallable callable = new MyCallable("1");
            ExecutorService executorRef = Executors.newCachedThreadPool();
            Future<String> future = executorRef.submit(callable);
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("里面出错了！");
            e.printStackTrace();
        }
    }
}
/*
里面出错了！
java.util.concurrent.ExecutionException: java.lang.NumberFormatException: For input string: "a"
	at java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.util.concurrent.FutureTask.get(FutureTask.java:192)
	at com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p091future_callable_6.test.run.Run.main(Run.java:17)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Caused by: java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p091future_callable_6.extcallable.MyCallable.call(MyCallable.java:15)
	at com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p091future_callable_6.extcallable.MyCallable.call(MyCallable.java:5)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)
Process finished with exit code 1
 */