package Concurrency.WaitNotify;

/**
 * All rights Reserved, Designed By www.baozun.com
 *
 * @title: OddAndEvenPrintDemo
 * @package: Concurrency.WaitNotify
 * @description: (用一句话描述该文件做什么)
 * @author: xugejun(giorno.xu @ baozun.com)
 * @date: 2019-12-24 15:44
 * @version: v1.0
 * @copyright: 2019 www.baozun.com Inc. All rights reserved.
 * 注意：本内容仅限于上海宝尊电商内部传阅，禁止外泄以及用于其他的商业目的
 */
public class OddAndEvenPrintDemo {

    private static volatile Integer i = 1;

    private static final Object lock = new Object();

    private static class OddAndEvenTask implements Runnable{

        @Override
        public void run() {
            synchronized (lock) {
                for (;i <= 100;){
                    System.out.println(i++);
                    try {
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                lock.notifyAll();
            }

        }
    }


    public static void main(String[] args) {
        new Thread(new OddAndEvenTask(),"task1").start();
        new Thread(new OddAndEvenTask(),"task2").start();
    }
}
