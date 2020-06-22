package com.yk.thread.Synchronized;

/**
 * @Param
 * @ClassName RunnableImpl
 * @Description 卖票案例出现了线程安全问题
 *              卖出了不存在的票和重复的票
 *
 *              解决线程安全问题的第一种方案：
 *              格式：
 *                  synchronized(锁对象){
 *                      可能出现线程安全问题的代码（访问了共享数据的代码）
 *                  }
 *              注意：
 *                  1.通过代码块中的锁对象，可以使用任意的对象
 *                  2.但是必须保证多个线程使用的锁对象是同一个
 *                  3.锁对象作用：
 *                      把同步代码块锁住，只让一个线程在同步代码块中执行
 * @Author yk
 * @Date 2020/6/22 0022 19:12
 * @Return
 **/
public class RunnableImpl implements Runnable {
    /*定义一个多个线程共享的票源*/
    private int ticket = 100;

    /*创建一个锁对象*/
    Object obj = new Object();

    //设置线程任务：卖票
    public void run() {
     /*创建一个同步代码块*/
        synchronized (obj){
            /*使用死循环，让卖票操作重复执行*/
            while(true){
                /*先判断票是否存在*/
                if (ticket > 0 ){
                    /*提高安全问题出现的概率，让程序睡眠*/
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    /*票存在，卖票 ticket--*/
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                }
            }
        }
    }
}
