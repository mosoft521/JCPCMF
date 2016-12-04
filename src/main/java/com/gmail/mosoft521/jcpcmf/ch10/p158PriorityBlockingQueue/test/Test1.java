package com.gmail.mosoft521.jcpcmf.ch10.p158PriorityBlockingQueue.test;

import com.gmail.mosoft521.jcpcmf.ch10.p158PriorityBlockingQueue.entity.Userinfo;

import java.util.concurrent.PriorityBlockingQueue;

public class Test1 {
    public static void main(String[] args) {
        PriorityBlockingQueue<Userinfo> queue = new PriorityBlockingQueue<Userinfo>();
        queue.add(new Userinfo(12));
        queue.add(new Userinfo(13478));
        queue.add(new Userinfo(1569));
        queue.add(new Userinfo(1346));
        queue.add(new Userinfo(1762));
        queue.add(new Userinfo(1876876));

        System.out.println(queue.poll().getId());
        System.out.println(queue.poll().getId());
        System.out.println(queue.poll().getId());
        System.out.println(queue.poll().getId());
        System.out.println(queue.poll().getId());
        System.out.println(queue.poll().getId());
        System.out.println(queue.poll());
    }
}
/*
12
1346
1569
1762
13478
1876876
null

Process finished with exit code 0
 */