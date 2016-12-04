package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p125test1.action;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {
    @Override
    protected void compute() {
        System.out.println("compute run!");
    }
}