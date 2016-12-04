package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p103test6.test;

import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p103test6.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p103test6.mycallable.MyCallableB;

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
            list.add(new MyCallableB());
            list.add(new MyCallableA());

            ExecutorService service = Executors.newCachedThreadPool();
            String getString = service.invokeAny(list);
            System.out.println("main取得的返回值=" + getString);
        } catch (InterruptedException e) {
            System.out.println("main Interrupted_Exception");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("main Execution_Exception");
            e.printStackTrace();
        }
    }
}
/*
...
MyCallableA 在运行中=123453
MyCallableA 在运行中=123454
MyCallableA 在运行中=123455
MyCallableA 在运行中=123456
xxxxxxxx=中断了

Process finished with exit code 1
 */