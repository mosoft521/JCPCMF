package com.gmail.mosoft521.jcpcmf.ch10.p161SynchronousQueue.test;

import com.gmail.mosoft521.jcpcmf.ch10.p161SynchronousQueue.extthread.ThreadPut;
import com.gmail.mosoft521.jcpcmf.ch10.p161SynchronousQueue.extthread.ThreadTake;
import com.gmail.mosoft521.jcpcmf.ch10.p161SynchronousQueue.service.MyService;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadPut threadPut = new ThreadPut(service);
        ThreadTake threadTake = new ThreadTake(service);
        threadTake.start();
        Thread.sleep(2000);
        threadPut.start();
    }
}
/*
...
take=anyString0.07175353399770446
 put=anyString0.7837495236520895
take=anyString0.7837495236520895
 put=anyString0.3124621801275974
take=anyString0.3124621801275974
 put=anyString0.15250229318366437
take=anyString0.15250229318366437
Process finished with exit code 0
 */