package com.gmail.mosoft521.jcpcmf.ch10.p154ConcurrentLinkedDeque.test1;

import com.gmail.mosoft521.jcpcmf.ch10.p154ConcurrentLinkedDeque.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch10.p154ConcurrentLinkedDeque.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch10.p154ConcurrentLinkedDeque.myservice.MyService;

public class Test {
    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            ThreadA a = new ThreadA(service);
            ThreadB b = new ThreadB(service);
            a.start();
            b.start();
            a.join();
            b.join();
            System.out.println(service.queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
9999
9998
9997
9996
9995
...
7
6
5
4
3
2
1
0
257
0
Process finished with exit code 0
 */