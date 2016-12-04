package com.gmail.mosoft521.jcpcmf.ch10Set.TreeSet.test;

import java.util.Iterator;
import java.util.TreeSet;

public class Test13 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(10);
        set.add(9);
        set.add(1);
        set.add(2);
        // tailSet:>=2
        set = (TreeSet) set.tailSet(2);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
2
9
10
Process finished with exit code 0
 */