package com.yk.thread.demo2;

/**
 * @Param
 * @ClassName Demo1Thread
 * @Description 创建多线程程序的第一种方式：创建Thread类的子类
 *              java.lang.Thread类：是描述线程的类，我们想要实现多线程程序，就必须继承Thread类
 *
 *              实现步骤：
 *                  1.创建一个Thread类的子类
 *                  2.在Thread类的子类中重写了Thread类中的run方法，设置线程任务（开启线程要做什么？）
 *                  3.创建Thread类的子类对象
 *                  4.调用Thread类中的方法start方法，开启新的线程，执行run方法
 *                      void start()使该线程开始执行；java虚拟机调用该线程的run方法。
 *                      结果是两个线程并发的运行，当前线程（main线程）和另一个线程（创建的新线程，执行其run方法）
 *                      多次使用一个线程是非法的，特别是当线程已经结束执行后，不能再重新启动
 *                      java程序属于抢占式调度，哪个线程的优先级高，哪个线程优先执行，同一个优先级，随机选择一个执行
 * @Author yk
 * @Date 2020/6/15 0015 20:36
 * @Return
 **/
public class Demo1Thread extends Thread {
    public static void main(String[] args) {
/**
 * 3.创建Thread类的子类对象
 */
    MyThread mt = new MyThread();
/**
 * 4.调用Thread类中的方法start方法，开启新的线程，执行run方法
 * */
    mt.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println("main"+i);
        }
    }
}
