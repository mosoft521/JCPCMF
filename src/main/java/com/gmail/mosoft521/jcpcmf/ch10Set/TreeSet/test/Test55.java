package com.gmail.mosoft521.jcpcmf.ch10Set.TreeSet.test;

import java.util.TreeSet;

public class Test55 {

    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(10);
        set.add(9);
        set.add(1);
        set.add(2);

        System.out.println(set.first());
        System.out.println(set.last());

    }
}
/*
1
10

Process finished with exit code 0
 */