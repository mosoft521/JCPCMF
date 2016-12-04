package com.gmail.mosoft521.jcpcmf.ch10.p165LinkedTransferQueue_3.test2;

public class Test2 {

    public static void main(String[] args) {
        try {
            MyServiceB service = new MyServiceB();

            ThreadB1 a = new ThreadB1(service);
            a.setName("a");
            ThreadB2 b = new ThreadB2(service);
            b.setName("b");

            a.start();
            Thread.sleep(4000);
            b.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/*
a beginA 1480839304310
b beginB 1480839308304
b   endB 1480839308304
取得的值：我从ThreadB2来
a   endA 1480839308304

Process finished with exit code 0
 */