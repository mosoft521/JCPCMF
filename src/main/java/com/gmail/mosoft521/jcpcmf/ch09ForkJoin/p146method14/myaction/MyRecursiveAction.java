package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p146method14.myaction;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

    @Override
    protected void compute() {
        System.out.println("ThreadName=" + Thread.currentThread().getName());
    }

}
