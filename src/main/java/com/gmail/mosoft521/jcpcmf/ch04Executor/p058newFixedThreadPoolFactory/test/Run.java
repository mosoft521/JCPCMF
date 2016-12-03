package com.gmail.mosoft521.jcpcmf.ch04Executor.p058newFixedThreadPoolFactory.test;

import com.gmail.mosoft521.jcpcmf.ch04Executor.p058newFixedThreadPoolFactory.mythreadfactory.MyThreadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
    public static void main(String[] args) {
        MyThreadFactory threadFactory = new MyThreadFactory();
        ExecutorService executorService = Executors.newFixedThreadPool(2,
                threadFactory);
        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    System.out.println("begin 我在运行"
                            + System.currentTimeMillis() + " "
                            + Thread.currentThread().getName());
                    Thread.sleep(3000);
                    System.out.println("  end 我在运行"
                            + System.currentTimeMillis() + " "
                            + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
    }
}
/*
begin 我在运行1480768591004 定制池中的线程对象的名称0.38438422781997206
begin 我在运行1480768591007 定制池中的线程对象的名称0.3991634855400912
  end 我在运行1480768594004 定制池中的线程对象的名称0.38438422781997206
begin 我在运行1480768594004 定制池中的线程对象的名称0.38438422781997206
  end 我在运行1480768594007 定制池中的线程对象的名称0.3991634855400912
  end 我在运行1480768597004 定制池中的线程对象的名称0.38438422781997206

Process finished with exit code 1
 */