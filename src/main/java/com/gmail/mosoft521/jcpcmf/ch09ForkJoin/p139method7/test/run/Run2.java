package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p139method7.test.run;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p139method7.entity.Userinfo;
import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p139method7.myrunnable.MyRunnable;

import java.util.concurrent.ForkJoinPool;

public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Userinfo userinfo = new Userinfo();
        MyRunnable runnable = new MyRunnable(userinfo);
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(runnable, userinfo);
        Thread.sleep(100);
        // 上面使用sleep不标准，因为执行时间不固定
        // 如果打印的早则有可能出现打印null值的情况
        System.out.println("userinfo username=" + userinfo.getUsername());
        Thread.sleep(100);
    }
}
/*
已经设置完结！
userinfo username=设置的值
Process finished with exit code 0
 */