package com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p025CountDownLatch_test2_3_ext.test;

import com.gmail.mosoft521.jcpcmf.ch02CountDownLatch.p025CountDownLatch_test2_3_ext.extthread.MyThread;

import java.util.concurrent.CountDownLatch;

public class Run {

    public static void main(String[] args) {
        try {
            CountDownLatch comingTag = new CountDownLatch(10);
            CountDownLatch waitTag = new CountDownLatch(1);
            CountDownLatch waitRunTag = new CountDownLatch(10);
            CountDownLatch beginTag = new CountDownLatch(1);
            CountDownLatch endTag = new CountDownLatch(10);

            MyThread[] threadArray = new MyThread[10];
            for (int i = 0; i < threadArray.length; i++) {
                threadArray[i] = new MyThread(comingTag, waitTag, waitRunTag, beginTag, endTag);
                threadArray[i].start();
            }
            System.out.println("裁判员在等待选手的到来！");
            comingTag.await();
            System.out.println("裁判看到所有运动员来了，各就各位前“巡视”用时5秒");
            Thread.sleep(5000);
            waitTag.countDown();
            System.out.println("各就各位！");
            waitRunTag.await();
            Thread.sleep(2000);
            System.out.println("发令枪响起！");
            beginTag.countDown();
            endTag.await();
            System.out.println("所有运动员到达，统计比赛名次！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
运动员使用不同交通工具不同速度到达起跑点，正向这头走！
运动员使用不同交通工具不同速度到达起跑点，正向这头走！
运动员使用不同交通工具不同速度到达起跑点，正向这头走！
运动员使用不同交通工具不同速度到达起跑点，正向这头走！
运动员使用不同交通工具不同速度到达起跑点，正向这头走！
运动员使用不同交通工具不同速度到达起跑点，正向这头走！
裁判员在等待选手的到来！
运动员使用不同交通工具不同速度到达起跑点，正向这头走！
运动员使用不同交通工具不同速度到达起跑点，正向这头走！
运动员使用不同交通工具不同速度到达起跑点，正向这头走！
运动员使用不同交通工具不同速度到达起跑点，正向这头走！
Thread-9到起跑点了！
等待裁判说准备！
Thread-2到起跑点了！
等待裁判说准备！
Thread-7到起跑点了！
等待裁判说准备！
Thread-1到起跑点了！
等待裁判说准备！
Thread-0到起跑点了！
等待裁判说准备！
Thread-8到起跑点了！
等待裁判说准备！
Thread-3到起跑点了！
等待裁判说准备！
Thread-5到起跑点了！
等待裁判说准备！
Thread-4到起跑点了！
等待裁判说准备！
Thread-6到起跑点了！
等待裁判说准备！
裁判看到所有运动员来了，各就各位前“巡视”用时5秒
各就各位！
各就各位！准备起跑姿势！
各就各位！准备起跑姿势！
各就各位！准备起跑姿势！
各就各位！准备起跑姿势！
各就各位！准备起跑姿势！
各就各位！准备起跑姿势！
各就各位！准备起跑姿势！
各就各位！准备起跑姿势！
各就各位！准备起跑姿势！
各就各位！准备起跑姿势！
发令枪响起！
Thread-7 运行员起跑 并且跑赛过程用时不确定
Thread-9 运行员起跑 并且跑赛过程用时不确定
Thread-5 运行员起跑 并且跑赛过程用时不确定
Thread-1 运行员起跑 并且跑赛过程用时不确定
Thread-0 运行员起跑 并且跑赛过程用时不确定
Thread-3 运行员起跑 并且跑赛过程用时不确定
Thread-6 运行员起跑 并且跑赛过程用时不确定
Thread-4 运行员起跑 并且跑赛过程用时不确定
Thread-2 运行员起跑 并且跑赛过程用时不确定
Thread-8 运行员起跑 并且跑赛过程用时不确定
Thread-8 运行员到达终点
Thread-1 运行员到达终点
Thread-9 运行员到达终点
Thread-6 运行员到达终点
Thread-0 运行员到达终点
Thread-2 运行员到达终点
Thread-5 运行员到达终点
Thread-3 运行员到达终点
Thread-4 运行员到达终点
Thread-7 运行员到达终点
所有运动员到达，统计比赛名次！
 */