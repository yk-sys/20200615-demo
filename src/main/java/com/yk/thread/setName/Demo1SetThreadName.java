package com.yk.thread.setName;

/**
 * @Param
 * @ClassName Demo1SetThreadName
 * @Description TODO
 * @Author yk
 * @Date 2020/6/16 0016 21:13
 * @Return
 **/
public class Demo1SetThreadName  {
    public static void main(String[] args) {
        /*开启多线程*/
       MyThread mt = new MyThread();
        mt.setName("zhangsan");
        mt.start();

        /*开启多线程*/
        new MyThread("lisi").start();
    }
}
