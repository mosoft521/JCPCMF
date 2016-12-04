package com.gmail.mosoft521.jcpcmf.ch10List.Vector.test;

import java.util.Vector;

public class Test11 {

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("1");// 0
        vector.add("2");// 1
        vector.add("3");// 2
        vector.add("4");// 3
        vector.add("5");// 4

        vector.addElement("bottom1");
        System.out.println(vector.add("bottom2"));

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

    }

}
/*
true
1
2
3
4
5
bottom1
bottom2

Process finished with exit code 0
 */