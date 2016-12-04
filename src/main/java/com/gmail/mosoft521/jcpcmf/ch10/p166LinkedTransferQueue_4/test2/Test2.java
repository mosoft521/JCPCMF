package com.gmail.mosoft521.jcpcmf.ch10.p166LinkedTransferQueue_4.test2;

public class Test2 {

    public static void main(String[] args) {
        try {
            MyServiceB service = new MyServiceB();

            ThreadB1 a = new ThreadB1(service);
            a.setName("a");

            a.start();
            Thread.sleep(4000);
            System.out.println("队列大小为：" + service.queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/*
a beginA 1480839376479
tryTransfer(e) 返回值为：false
a   endA 1480839376480
队列大小为：0

Process finished with exit code 0
 */