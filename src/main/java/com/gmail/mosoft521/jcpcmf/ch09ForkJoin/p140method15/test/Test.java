package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p140method15.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p140method15.mycallable.MyCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Test {

    public static void main(String[] args) {
        try {
            List list = new ArrayList();
            list.add(new MyCallable(5000));
            list.add(new MyCallable(4000));
            list.add(new MyCallable(3000));
            list.add(new MyCallable(2000));
            list.add(new MyCallable(1000));

            ForkJoinPool pool = new ForkJoinPool();
            List<Future<String>> listFuture = pool.invokeAll(list);
            for (int i = 0; i < listFuture.size(); i++) {
                System.out.println(listFuture.get(i).get() + " nowTime："
                        + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
/*
ForkJoinPool-1-worker-1 sleep5000 nowTime：1480833594358
ForkJoinPool-1-worker-2 sleep4000 nowTime：1480833594358
ForkJoinPool-1-worker-3 sleep3000 nowTime：1480833594358
ForkJoinPool-1-worker-0 sleep2000 nowTime：1480833594358
ForkJoinPool-1-worker-0 sleep1000 nowTime：1480833596358
我是返回值 nowTime：1480833599358
我是返回值 nowTime：1480833599358
我是返回值 nowTime：1480833599358
我是返回值 nowTime：1480833599358
我是返回值 nowTime：1480833599358

Process finished with exit code 0
 */