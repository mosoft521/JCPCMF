package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.test.run;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.mycallable.MyCallableB;

public class Run6 {

	public static void main(String[] args) {
		try {
			MyCallableA callableA = new MyCallableA();
			MyCallableB callableB = new MyCallableB();

			Executor executor = Executors.newSingleThreadExecutor();
			CompletionService csRef = new ExecutorCompletionService(executor);
			csRef.submit(callableB);// 先执行B
			csRef.submit(callableA);// 后执行A

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
MyCallableB begin 1480818974922
MyCallableA begin 1480818979922
java.util.concurrent.ExecutionException: java.lang.Exception: 抛出异常！
	at java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.util.concurrent.FutureTask.get(FutureTask.java:192)
	at com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.test.run.Run6.main(Run6.java:28)
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
MyCallableA   end 1480818980922

Process finished with exit code 1
 */