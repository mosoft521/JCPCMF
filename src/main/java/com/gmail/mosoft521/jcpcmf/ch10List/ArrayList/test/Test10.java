package com.gmail.mosoft521.jcpcmf.ch10List.ArrayList.test;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE / 300; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - beginTime);
    }
}
/*
3809
Process finished with exit code 0
 */