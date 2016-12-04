package com.gmail.mosoft521.jcpcmf.ch10.p154ConcurrentLinkedDeque.extthread;

import com.gmail.mosoft521.jcpcmf.ch10.p154ConcurrentLinkedDeque.myservice.MyService;

public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        while (!service.queue.isEmpty()) {
            service.queue.pollFirst();
            System.out.println(service.queue.size());
        }
    }

}
