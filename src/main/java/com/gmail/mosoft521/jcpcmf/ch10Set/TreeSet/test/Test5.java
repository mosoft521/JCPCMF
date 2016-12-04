package com.gmail.mosoft521.jcpcmf.ch10Set.TreeSet.test;

import java.util.Iterator;
import java.util.TreeSet;

public class Test5 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(10);
        set.add(9);
        set.add(1);
        set.add(2);
        // 自动排序
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
1
2
9
10
Process finished with exit code 0
 */