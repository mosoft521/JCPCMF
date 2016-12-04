package com.gmail.mosoft521.jcpcmf.ch10Set.TreeSet.test;

import java.util.Iterator;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        Iterator iterator = set.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
6
5
4
3
2
1
Process finished with exit code 0
 */