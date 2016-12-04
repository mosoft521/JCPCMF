package com.gmail.mosoft521.jcpcmf.ch10Set.TreeSet.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test8 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(10);
        set.add(9);
        set.add(1);
        set.add(2);
        // headSet:最小到<10
        Set newSet = set.headSet(10);
        Iterator iterator = newSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
1
2
9
Process finished with exit code 0
 */