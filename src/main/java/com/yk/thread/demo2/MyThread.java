package com.yk.thread.demo2;

/**
 * @Param
 * @ClassName MyThread
 * @Description TODO
 * @Author yk
 * @Date 2020/6/15 0015 20:48
 * @Return
 **/
// 1. 创建一个Thread类的子类

public class MyThread extends Demo1Thread {

/**
 * 2.在Thread类的子类中重写了Thread类中的run方法，设置线程任务（开启线程要做什么？）
 * */
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("run"+i);
        }
    }
}
