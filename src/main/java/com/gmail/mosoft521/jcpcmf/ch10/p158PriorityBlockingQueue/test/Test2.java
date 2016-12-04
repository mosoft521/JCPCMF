package com.gmail.mosoft521.jcpcmf.ch10.p158PriorityBlockingQueue.test;

import com.gmail.mosoft521.jcpcmf.ch10.p158PriorityBlockingQueue.entity.Userinfo;

import java.util.concurrent.PriorityBlockingQueue;

public class Test2 {
    public static void main(String[] args) {
        try {
            PriorityBlockingQueue<Userinfo> queue = new PriorityBlockingQueue<Userinfo>();
            System.out.println("begin");
            System.out.println(queue.take());
            System.out.println("  end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/*
begin
阻塞住了？
Process finished with exit code 1
 */