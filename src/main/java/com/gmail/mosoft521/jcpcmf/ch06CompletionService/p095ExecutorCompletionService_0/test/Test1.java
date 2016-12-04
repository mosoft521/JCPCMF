package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p095ExecutorCompletionService_0.test;

import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p095ExecutorCompletionService_0.mycallable.MyCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) {
        try {
            MyCallable callable1 = new MyCallable("username1", 5000);
            MyCallable callable2 = new MyCallable("username2", 4000);
            MyCallable callable3 = new MyCallable("username3", 3000);
            MyCallable callable4 = new MyCallable("username4", 2000);
            MyCallable callable5 = new MyCallable("username5", 1000);
            List<Callable> callableList = new ArrayList<Callable>();
            callableList.add(callable1);
            callableList.add(callable2);
            callableList.add(callable3);
            callableList.add(callable4);
            callableList.add(callable5);
            ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 5,
                    TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
            CompletionService csRef = new ExecutorCompletionService(executor);
            for (int i = 0; i < 5; i++) {
                csRef.submit(callableList.get(i));
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("等待打印第" + (i + 1) + "个返回值");
                System.out.println(csRef.take().get());
            }
            // 按乱序打印的效果
            // 说明一个Future对应当前先执行完的Callable任务
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
/*
username2
等待打印第1个返回值
username1
username4
username5
username3
return username5
等待打印第2个返回值
return username4
等待打印第3个返回值
return username3
等待打印第4个返回值
return username2
等待打印第5个返回值
return username1
Process finished with exit code 1
 */