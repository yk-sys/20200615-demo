package com.yk.thread.demo1;

/**
 * @Param
 * @ClassName Demo1MainThread
 * @Description 主线程：执行主（main）方法的线程
 *              单线程程序：java程序中只有一个线程
 *              执行从main方法开始，从上到下依次执行
 * @Author yk
 * @Date 2020/6/15 0015 19:58
 * @Return
 **/
public class Demo1MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("张三");
        p1.run();
        System.out.println(0/0);
        Person p2 = new Person("李四");
        p2.run();
    }
}
