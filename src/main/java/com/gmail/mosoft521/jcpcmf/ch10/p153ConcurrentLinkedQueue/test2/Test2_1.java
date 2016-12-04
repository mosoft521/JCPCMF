package com.gmail.mosoft521.jcpcmf.ch10.p153ConcurrentLinkedQueue.test2;

import com.gmail.mosoft521.jcpcmf.ch10.p153ConcurrentLinkedQueue.myservice.MyService1;

public class Test2_1 {
    public static void main(String[] args) {
        MyService1 service = new MyService1();
        System.out.println(service.queue.poll());
    }
}
/*
null

Process finished with exit code 0
 */