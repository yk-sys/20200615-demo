package com.yk.thread.ThreadSafe;

/**
 * @Param
 * @ClassName Demo01Ticket
 * @Description 模拟卖票案例
 *              创建三个线程，同时开启，对共享的票进行出售
 * @Author yk
 * @Date 2020/6/22 0022 19:24
 * @Return
 **/
public class Demo01Ticket {
    public static void main(String[] args) {
        /*创建Runnable接口的实现类对象*/
        Runnable run = new RunnableImpl();
        /*创建Thread类对象，构造方法中传递Runnable接口的实现类对象*/
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        /*调用start方法开启多线程*/
        t0.start();
        t1.start();
        t2.start();
    }
}
