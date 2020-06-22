package com.yk.thread.getName;

/**
 * @Param
 * @ClassName Demo1GetThreadName
 * @Description TODO
 * @Author yk
 * @Date 2020/6/16 0016 20:35
 * @Return
 **/
public class Demo1GetThreadName {
    public static void main(String[] args) {
        /*创建Thread类的子类对象*/
        MyThread mt = new MyThread();
        /*调用start方法，开启新线程，执行run方法*/
        mt.start();
        /* 线程的名称：
        *       主线程：main
        *       新线程：Thread-0*，Thread-1,Thread-2/
         */
        new MyThread().start();

        /*获取主线程名称*/
        System.out.println(Thread.currentThread().getName());
    }
}
