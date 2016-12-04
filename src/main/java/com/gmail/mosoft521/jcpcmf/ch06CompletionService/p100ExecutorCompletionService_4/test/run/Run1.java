package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p100ExecutorCompletionService_4.test.run;

import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p100ExecutorCompletionService_4.entity.Userinfo;
import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p100ExecutorCompletionService_4.myrunnable.MyRunnable;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Run1 {
    public static void main(String[] args) {
        try {
            Userinfo userinfo = new Userinfo();
            MyRunnable myRunnable = new MyRunnable(userinfo);
            Executor executor = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(executor);
            Future<Userinfo> future = csRef.submit(myRunnable, userinfo);
            System.out.println(future.get().getUsername() + " "
                    + future.get().getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
/*
run 运行了
usernameValue passwordValue
Process finished with exit code 1
 */