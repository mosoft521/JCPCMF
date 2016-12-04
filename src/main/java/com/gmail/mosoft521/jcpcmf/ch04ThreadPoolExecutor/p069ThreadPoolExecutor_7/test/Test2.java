package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p069ThreadPoolExecutor_7.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p069ThreadPoolExecutor_7.myrejectedexecutionhandler.MyRejectedExecutionHandler;
import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p069ThreadPoolExecutor_7.myrunnable.MyRunnable1;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable1 = new MyRunnable1("中国1");
        MyRunnable1 myRunnable2 = new MyRunnable1("中国2");
        MyRunnable1 myRunnable3 = new MyRunnable1("中国3");
        MyRunnable1 myRunnable4 = new MyRunnable1("中国4");
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 9999L,
                TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        pool.setRejectedExecutionHandler(new MyRejectedExecutionHandler());
        pool.execute(myRunnable1);
        pool.execute(myRunnable2);
        pool.execute(myRunnable3);
        pool.execute(myRunnable4);
    }
}
/*
中国4 被拒绝执行
pool-1-thread-1 1480771287300
pool-1-thread-3 1480771287300
pool-1-thread-2 1480771287300
pool-1-thread-2 1480771291300
pool-1-thread-1 1480771291300
pool-1-thread-3 1480771291300
Process finished with exit code 1
 */