package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p146method14.mytask;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<String> {
    @Override
    protected String compute() {
        return "我是返回值";
    }
}