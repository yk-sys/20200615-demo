package com.yk.thread.getName;

/**
 * @Param
 * @ClassName MyThread
 * @Description 获取线程中的名称：
 *              1.使用Thread类中的方法getName()
 *                      String getName()返回线程的名称
 *              2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
 *                      static Thread currentThread() 返回对当前正在执行的线程对象的引用
 * @Author yk
 * @Date 2020/6/16 0016 20:26
 * @Return
 **/

public class MyThread extends Thread {
    /*重写thread中的run方法，设置线程任务*/

    @Override
    public void run() {
        /*获取线程名称
        1.
        String name = getName();
        System.out.println(name);
        */
        /*
        2,
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println(name);*/

        /*链式调用*/
        System.out.println(Thread.currentThread().getName());
    }
}
