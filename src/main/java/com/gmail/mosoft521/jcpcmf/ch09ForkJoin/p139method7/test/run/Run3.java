package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p139method7.test.run;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p139method7.entity.Userinfo;
import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p139method7.myrunnable.MyRunnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Run3 {
    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        Userinfo userinfo = new Userinfo();
        MyRunnable runnable = new MyRunnable(userinfo);
        ForkJoinPool pool = new ForkJoinPool();
        Future<Userinfo> future = pool.submit(runnable, userinfo);
        System.out.println(future);
        // 建议使用此种方式future.get()
        // 因为get()方法呈阻塞效果
        System.out.println("userinfo username=" + future.get().getUsername());
    }
}
/*
java.util.concurrent.ForkJoinTask$AdaptedRunnable@6d6f6e28
已经设置完结！
userinfo username=设置的值
Process finished with exit code 0
 */