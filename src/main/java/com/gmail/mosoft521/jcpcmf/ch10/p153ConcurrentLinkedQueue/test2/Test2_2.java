package com.gmail.mosoft521.jcpcmf.ch10.p153ConcurrentLinkedQueue.test2;

import com.gmail.mosoft521.jcpcmf.ch10.p153ConcurrentLinkedQueue.myservice.MyService1;

public class Test2_2 {

    public static void main(String[] args) {
        MyService1 service = new MyService1();
        service.queue.add("a");
        service.queue.add("b");
        service.queue.add("c");
        System.out.println(service.queue.poll());
    }
}
/*
a

Process finished with exit code 0
 */