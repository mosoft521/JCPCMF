package com.gmail.mosoft521.jcpcmf.ch10List.ArrayList.test;

import java.util.ArrayList;

public class Test28 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Integer[] intergerArray = new Integer[0];
        intergerArray = list.toArray(intergerArray);
        for (int i = 0; i < intergerArray.length; i++) {
            System.out.println(intergerArray[i] + 100);
        }
    }
}
/*
101
102
103
104
105
106
Process finished with exit code 0
 */