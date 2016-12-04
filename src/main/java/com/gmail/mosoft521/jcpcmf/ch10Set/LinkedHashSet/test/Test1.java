package com.gmail.mosoft521.jcpcmf.ch10Set.LinkedHashSet.test;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("a1");
        set.add("x");
        set.add("y");
        set.add("z");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
a1
x
y
z
Process finished with exit code 0
 */