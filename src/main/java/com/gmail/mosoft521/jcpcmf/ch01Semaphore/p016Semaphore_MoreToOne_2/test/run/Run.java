package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p016Semaphore_MoreToOne_2.test.run;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p016Semaphore_MoreToOne_2.extthread.MyThread;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p016Semaphore_MoreToOne_2.service.Service;

public class Run {

    public static void main(String[] args) {
        Service service = new Service();

        MyThread[] threadArray = new MyThread[12];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(service);
            threadArray[i].start();
        }
    }
}
/*
ThreadName=Thread-0准备
begin hello 1480669724607
Thread-0打印1
Thread-0打印2
Thread-0打印3
Thread-0打印4
Thread-0打印5
  end hello 1480669724607
ThreadName=Thread-0结束
ThreadName=Thread-1准备
begin hello 1480669724607
Thread-1打印1
Thread-1打印2
Thread-1打印3
Thread-1打印4
Thread-1打印5
  end hello 1480669724607
ThreadName=Thread-1结束
ThreadName=Thread-2准备
begin hello 1480669724608
Thread-2打印1
Thread-2打印2
Thread-2打印3
Thread-2打印4
Thread-2打印5
  end hello 1480669724608
ThreadName=Thread-2结束
ThreadName=Thread-4准备
ThreadName=Thread-5准备
begin hello 1480669724608
Thread-5打印1
Thread-5打印2
Thread-5打印3
Thread-5打印4
Thread-5打印5
  end hello 1480669724609
ThreadName=Thread-5结束
begin hello 1480669724609
Thread-4打印1
Thread-4打印2
Thread-4打印3
Thread-4打印4
Thread-4打印5
  end hello 1480669724609
ThreadName=Thread-4结束
ThreadName=Thread-9准备
begin hello 1480669724609
Thread-9打印1
Thread-9打印2
Thread-9打印3
Thread-9打印4
Thread-9打印5
  end hello 1480669724609
ThreadName=Thread-9结束
ThreadName=Thread-8准备
begin hello 1480669724610
Thread-8打印1
Thread-8打印2
Thread-8打印3
Thread-8打印4
Thread-8打印5
  end hello 1480669724610
ThreadName=Thread-8结束
ThreadName=Thread-3准备
begin hello 1480669724610
Thread-3打印1
Thread-3打印2
Thread-3打印3
Thread-3打印4
Thread-3打印5
  end hello 1480669724611
ThreadName=Thread-3结束
ThreadName=Thread-6准备
begin hello 1480669724611
Thread-6打印1
Thread-6打印2
Thread-6打印3
Thread-6打印4
Thread-6打印5
  end hello 1480669724611
ThreadName=Thread-6结束
ThreadName=Thread-10准备
begin hello 1480669724611
Thread-10打印1
Thread-10打印2
Thread-10打印3
Thread-10打印4
Thread-10打印5
  end hello 1480669724611
ThreadName=Thread-10结束
ThreadName=Thread-7准备
begin hello 1480669724612
Thread-7打印1
Thread-7打印2
Thread-7打印3
Thread-7打印4
Thread-7打印5
  end hello 1480669724612
ThreadName=Thread-7结束
ThreadName=Thread-11准备
begin hello 1480669724612
Thread-11打印1
Thread-11打印2
Thread-11打印3
Thread-11打印4
Thread-11打印5
  end hello 1480669724612
ThreadName=Thread-11结束
 */