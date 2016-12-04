package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p133method1.myaction;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {
    @Override
    protected void compute() {
        System.out.println("ThreadName=" + Thread.currentThread().getName());
    }
}
