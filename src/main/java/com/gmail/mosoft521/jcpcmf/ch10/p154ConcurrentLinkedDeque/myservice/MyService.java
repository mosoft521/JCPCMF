package com.gmail.mosoft521.jcpcmf.ch10.p154ConcurrentLinkedDeque.myservice;

import java.util.concurrent.ConcurrentLinkedDeque;

public class MyService {
    public ConcurrentLinkedDeque queue = new ConcurrentLinkedDeque();

    public MyService() {
        for (int i = 0; i < 10000; i++) {
            queue.add("string" + (i + 1));
        }
    }
}