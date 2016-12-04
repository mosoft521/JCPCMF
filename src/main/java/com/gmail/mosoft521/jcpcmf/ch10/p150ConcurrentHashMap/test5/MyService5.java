package com.gmail.mosoft521.jcpcmf.ch10.p150ConcurrentHashMap.test5;

import java.util.concurrent.ConcurrentHashMap;

public class MyService5 {

    public ConcurrentHashMap map = new ConcurrentHashMap();
    ;

    public MyService5() {
        for (int i = 0; i < 5; i++) {
            map.put("key" + (i + 1), "value" + (i + 1));
        }
    }
}
