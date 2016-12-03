package com.gmail.mosoft521.jcpcmf.ch04Executor.p053Executors_1.test.run;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run2 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("run!");
                }
            });
        }
    }
}
/*
run!
run!
run!
run!
run!

Process finished with exit code 1
 */