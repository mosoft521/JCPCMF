package com.gmail.mosoft521.jcpcmf.ch10.p159LinkedBlockingQueue.test;

import java.util.concurrent.LinkedBlockingQueue;

public class test4 {

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue queue = new LinkedBlockingQueue(3);
        System.out.println(queue.add("abc"));
        System.out.println(queue.add("abc"));
        System.out.println(queue.add("abc"));
        System.out.println(queue.add("abc"));
        System.out.println(queue.size());
    }
}
/*
Exception in thread "main" java.lang.IllegalStateException: Queue full
	at java.util.AbstractQueue.add(AbstractQueue.java:98)
	at com.gmail.mosoft521.jcpcmf.ch10.p159LinkedBlockingQueue.test.test4.main(test4.java:12)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
true
true
true

Process finished with exit code 1
 */