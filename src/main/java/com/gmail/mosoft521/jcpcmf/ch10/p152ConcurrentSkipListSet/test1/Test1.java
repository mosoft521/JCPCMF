package com.gmail.mosoft521.jcpcmf.ch10.p152ConcurrentSkipListSet.test1;

public class Test1 {

    public static void main(String[] args) {
        MyService1 service = new MyService1();
        ThreadA a = new ThreadA(service);
        ThreadA b = new ThreadA(service);

        a.start();
        b.start();

    }
}
/*
1 username1
2 username2
3 username3
4 username4
5 username5

Process finished with exit code 0
 */