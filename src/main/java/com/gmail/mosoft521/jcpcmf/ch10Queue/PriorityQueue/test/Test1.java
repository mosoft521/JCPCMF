package com.gmail.mosoft521.jcpcmf.ch10Queue.PriorityQueue.test;

import java.util.PriorityQueue;

public class Test1 {
    public static void main(String[] args) {
        PriorityQueue pqRef = new PriorityQueue();
        pqRef.add(3);
        pqRef.add(2);
        pqRef.add(1);
        pqRef.add(999);
        pqRef.add(888);
        pqRef.add(777);
        Integer myInteger;
        System.out.println(pqRef.poll());
        System.out.println(pqRef.poll());
        System.out.println(pqRef.poll());
        System.out.println(pqRef.poll());
        System.out.println(pqRef.poll());
        System.out.println(pqRef.poll());
        System.out.println(pqRef.size());
    }
}
/*
1
2
3
777
888
999
0
Process finished with exit code 0
 */