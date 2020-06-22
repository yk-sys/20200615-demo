package com.yk.thread.ThreadSafe;

/**
 * @Param
 * @ClassName RunnableImpl
 * @Description 实现卖票案例
 * @Author yk
 * @Date 2020/6/22 0022 19:12
 * @Return
 **/
public class RunnableImpl implements Runnable {
    /*定义一个多个线程共享的票源*/
    private int ticket = 100;

    //设置线程任务：卖票
    public void run() {
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
