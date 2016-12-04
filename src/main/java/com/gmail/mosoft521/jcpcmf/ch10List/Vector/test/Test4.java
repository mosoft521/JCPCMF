package com.gmail.mosoft521.jcpcmf.ch10List.Vector.test;

import java.util.Enumeration;
import java.util.Vector;

public class Test4 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("5");
        Enumeration enum1 = vector.elements();
        while (enum1.hasMoreElements()) {
            System.out.println(enum1.nextElement());
        }
    }
}
/*
1
2
3
4
5
Process finished with exit code 0
 */