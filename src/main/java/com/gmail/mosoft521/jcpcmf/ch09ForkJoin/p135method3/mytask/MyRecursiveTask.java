package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p135method3.mytask;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<String> {
    @Override
    protected String compute() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "我是返回值";
    }
}
