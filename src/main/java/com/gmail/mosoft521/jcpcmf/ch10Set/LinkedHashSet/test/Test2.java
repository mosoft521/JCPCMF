package com.gmail.mosoft521.jcpcmf.ch10Set.LinkedHashSet.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test2 {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
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