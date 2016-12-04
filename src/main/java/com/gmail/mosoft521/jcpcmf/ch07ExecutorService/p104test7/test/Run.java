package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p104test7.test;

import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p104test7.mycallable.MyCallableA;
import com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p104test7.mycallable.MyCallableB;

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
            System.out.println("zzzz=" + getString);
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
MyCallableB 在运行中=193455
MyCallableB 在运行中=193456
MyCallableB pool-1-thread-1   end 1480821181103
zzzz=returnB
Process finished with exit code 1
 */