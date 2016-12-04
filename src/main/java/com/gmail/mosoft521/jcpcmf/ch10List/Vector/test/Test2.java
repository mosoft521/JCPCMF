package com.gmail.mosoft521.jcpcmf.ch10List.Vector.test;

import java.util.Vector;

public class Test2 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("1");
        vector.add("2");
        vector.add("3");
        // 设置Capacity值
        vector.ensureCapacity(50);
        System.out.println(vector.capacity());
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }
}
/*
50
1
2
3
Process finished with exit code 0
 */