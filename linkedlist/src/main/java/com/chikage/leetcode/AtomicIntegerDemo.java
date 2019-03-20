package com.chikage.leetcode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: AtomicIntegerDemo
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/2/14 11:46 PM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class AtomicIntegerDemo {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            int i1 = atomicInteger.incrementAndGet();
            System.out.println("线程1得到的i的值："+i1);
        });
    }
}
