package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.concurrent.LinkedBlockingDeque;

public class takeLast_2 {

    public static void main(String[] args) {
        try {
            LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
            System.out.println("begin");
            System.out.println(deque.takeLast());
            System.out.println("  end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/*
begin
阻塞了？
Process finished with exit code 1
 */