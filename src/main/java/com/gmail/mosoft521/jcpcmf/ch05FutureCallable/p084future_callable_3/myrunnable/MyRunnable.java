package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p084future_callable_3.myrunnable;

import com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p084future_callable_3.entity.Userinfo;

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
    }
}
