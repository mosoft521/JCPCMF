package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p081runnable_asynchronized_test.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p081runnable_asynchronized_test.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 10,
                TimeUnit.SECONDS, new LinkedBlockingDeque());
        for (int i = 0; i < 50; i++) {
            MyRunnable myrunnable = new MyRunnable("username" + (i + 1));
            executor.execute(myrunnable);
        }
    }
}
/*
username1
username2
username5
username6
username4
username3
username7
username8
username10
username11
username12
username13
username14
username9
username16
username18
username19
username20
username21
username22
username23
username24
username25
username26
username27
username28
username29
username30
username31
username32
username33
username34
username35
username36
username37
username38
username39
username40
username41
username42
username43
username44
username45
username46
username47
username48
username49
username50
username17
username15
Process finished with exit code 1
 */