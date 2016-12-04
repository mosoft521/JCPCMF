package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p098ExecutorCompletionService_3.test.run;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p098ExecutorCompletionService_3.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p098ExecutorCompletionService_3.mycallable.MyCallableB;

public class Run4 {

	public static void main(String[] args) {

		try {
			MyCallableA callableA = new MyCallableA();
			MyCallableB callableB = new MyCallableB();

			Executor executor = Executors.newCachedThreadPool();
			CompletionService csRef = new ExecutorCompletionService(executor);
			csRef.submit(callableA);
			csRef.submit(callableB);

			System.out.println("zzzzzzzzzzzz" + " "
					+ csRef.poll(4, TimeUnit.SECONDS) + " "
					+ System.currentTimeMillis());
			System.out.println("X");
			System.out.println("zzzzzzzzzzzz" + " "
					+ csRef.poll(7, TimeUnit.SECONDS).get() + " "
					+ System.currentTimeMillis());
			System.out.println("X");

			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
/*
zzzzzzzzzzzz null 1480818614241
X
MyCallableA 1480818615240
zzzzzzzzzzzz returnA 1480818615240
X
main end!
MyCallableB 1480818620243

Process finished with exit code 1
 */