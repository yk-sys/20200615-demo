package com.yk.thread.runnable;

/**
 * @Param
 * @ClassName RunnableImpl
 * @Description TODO
 * @Author yk
 * @Date 2020/6/17 0017 21:02
 * @Return
 **/
/** 1.创建一个Runnable接口的实现类*/
public class RunnableImpl implements Runnable {
    public void run() {
/** 2.在实现类中重写Runnable接口的run方法，设置线程任务*/
        for (int i = 0; i <20 ; i++) {
        System.out.println(Thread.currentThread().getName()+"----->"+i);
    }
}
}
