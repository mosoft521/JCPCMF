package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p139method7.test.run;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p139method7.entity.Userinfo;
import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p139method7.myrunnable.MyRunnable;

import java.util.concurrent.ForkJoinPool;

public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        Userinfo userinfo = new Userinfo();
        MyRunnable runnable = new MyRunnable(userinfo);
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(runnable, userinfo);
        // 取不到值
        System.out.println("userinfo username=" + userinfo.getUsername());
        Thread.sleep(2000);
    }
}
/*
userinfo username=null
已经设置完结！
 */