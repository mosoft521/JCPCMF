package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class push_1 {
    public static void main(String[] args) {
        // push
        // ��Ԫ�ز���˫�˶��еĿ�ͷ
        LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
        deque.push("anyString1");
        deque.push("anyString2");
        deque.push("anyString3");
        System.out.println(deque.size());
        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
3
anyString3
anyString2
anyString1
Process finished with exit code 0
 */