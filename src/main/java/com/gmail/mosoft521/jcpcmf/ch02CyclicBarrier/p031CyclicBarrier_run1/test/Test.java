package com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p031CyclicBarrier_run1.test;

import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p031CyclicBarrier_run1.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch02CyclicBarrier.p031CyclicBarrier_run1.service.MyService;

import java.util.concurrent.CyclicBarrier;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cbRef = new CyclicBarrier(2);
        MyService service = new MyService(cbRef);
        ThreadA threadA1 = new ThreadA(service);
        threadA1.setName("A");
        threadA1.start();
        ThreadA threadA2 = new ThreadA(service);
        threadA2.setName("B");
        threadA2.start();
        ThreadA threadA3 = new ThreadA(service);
        threadA3.setName("C");
        threadA3.start();
        ThreadA threadA4 = new ThreadA(service);
        threadA4.setName("D");
        threadA4.start();
    }
}
/*
A 1480753204013 begin跑第1阶段1
D 1480753207177 begin跑第1阶段2
D 1480753207177   end跑第1阶段 0
A 1480753207177   end跑第1阶段 0
D 1480753207933 begin跑第2阶段1
B 1480753208777 begin跑第1阶段2
B 1480753208777   end跑第1阶段 0
D 1480753208777   end跑第2阶段 0
B 1480753208940 begin跑第2阶段1
C 1480753211140 begin跑第1阶段2
C 1480753211140   end跑第1阶段 0
B 1480753211140   end跑第2阶段 0
A 1480753212106 begin跑第2阶段1
C 1480753219007 begin跑第2阶段2
C 1480753219007   end跑第2阶段 0
A 1480753219007   end跑第2阶段 0
 */