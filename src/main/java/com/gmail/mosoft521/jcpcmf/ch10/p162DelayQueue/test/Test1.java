package com.gmail.mosoft521.jcpcmf.ch10.p162DelayQueue.test;

import com.gmail.mosoft521.jcpcmf.ch10.p162DelayQueue.entity.Userinfo;

import java.util.concurrent.DelayQueue;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {

        DelayQueue<Userinfo> queue = new DelayQueue<Userinfo>();
        queue.add(new Userinfo(7, "username5"));
        queue.add(new Userinfo(6, "username4"));
        queue.add(new Userinfo(5, "username3"));
        queue.add(new Userinfo(4, "username2"));
        queue.add(new Userinfo(3, "username1"));

        System.out.println("          " + System.currentTimeMillis());

        System.out.println(queue.take().getUsername() + " "
                + System.currentTimeMillis());
        System.out.println(queue.take().getUsername() + " "
                + System.currentTimeMillis());
        System.out.println(queue.take().getUsername() + " "
                + System.currentTimeMillis());
        System.out.println(queue.take().getUsername() + " "
                + System.currentTimeMillis());
        System.out.println(queue.take().getUsername() + " "
                + System.currentTimeMillis());

    }

}
/*
          1480838997213
username1 1480839000214
username2 1480839001214
username3 1480839002215
username4 1480839003214
username5 1480839004214

Process finished with exit code 0
 */