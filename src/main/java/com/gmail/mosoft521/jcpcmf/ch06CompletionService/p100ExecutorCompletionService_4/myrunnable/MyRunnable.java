package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p100ExecutorCompletionService_4.myrunnable;

import com.gmail.mosoft521.jcpcmf.ch06CompletionService.p100ExecutorCompletionService_4.entity.Userinfo;

public class MyRunnable implements Runnable {
    private Userinfo userinfo;

    public MyRunnable(Userinfo userinfo) {
        super();
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        userinfo.setUsername("usernameValue");
        userinfo.setPassword("passwordValue");
        System.out.println("run 运行了 ");
    }
}
