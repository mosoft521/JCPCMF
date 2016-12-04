package com.gmail.mosoft521.jcpcmf.ch10.p157ArrayBlockingQueue.test;

import java.util.concurrent.ArrayBlockingQueue;

public class add_2 {

    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
        System.out.println(queue.add("myString1"));
        System.out.println(queue.add("myString2"));
        System.out.println(queue.add("myString3"));
        System.out.println(queue.add("myString4"));

    }
}
/*
true
true
true
Exception in thread "main" java.lang.IllegalStateException: Queue full
	at java.util.AbstractQueue.add(AbstractQueue.java:98)
	at java.util.concurrent.ArrayBlockingQueue.add(ArrayBlockingQueue.java:312)
	at com.gmail.mosoft521.jcpcmf.ch10.p157ArrayBlockingQueue.test.add_2.main(add_2.java:12)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

Process finished with exit code 1

 */