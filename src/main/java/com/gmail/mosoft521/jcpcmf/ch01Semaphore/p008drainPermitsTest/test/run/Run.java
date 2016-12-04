package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p008drainPermitsTest.test.run;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p008drainPermitsTest.myservice.MyService;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        service.testMethod();
    }
}
/*
9
9 0
0 0
0 0
 */