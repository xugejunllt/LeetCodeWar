package com.chikage.leetcode;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: VolatileDemo
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/2/14 1:56 AM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class VolatileDemo {
    private static boolean flag;
    private static int num;

    public static void main(String[] args) {

//        ExecutorService executorService = Executors.newFixedThreadPool(10000);

        Thread t1 = new Thread(() -> {
                while (!flag) {
                    Thread.yield();
                }
                System.out.println(num);
        });
        t1.start();
        num = 5;
        flag = true;
//        executorService.execute(t1);


    }
}
