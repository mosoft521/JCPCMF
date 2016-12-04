package com.gmail.mosoft521.jcpcmf.ch10List.ArrayList.test;

import java.util.ArrayList;

public class Test6 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("大中国1");
        list.add("大中国2");

        ArrayList listNew = (ArrayList) list.clone();

        System.out.println(list.hashCode());
        System.out.println(listNew.hashCode());
        for (int i = 0; i < listNew.size(); i++) {
            System.out.println(listNew.get(i));
        }
    }
}
/*
920136450
920136450
大中国1
大中国2

Process finished with exit code 0
 */