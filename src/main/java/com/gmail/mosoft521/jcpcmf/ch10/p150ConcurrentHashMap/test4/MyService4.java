package com.gmail.mosoft521.jcpcmf.ch10.p150ConcurrentHashMap.test4;

import java.util.Hashtable;

public class MyService4 {
    public static Hashtable hashtable = new Hashtable();

    public MyService4() {
        for (int i = 0; i < 5; i++) {
            hashtable.put("String" + (i + 1), i + 1);
        }
    }
}
