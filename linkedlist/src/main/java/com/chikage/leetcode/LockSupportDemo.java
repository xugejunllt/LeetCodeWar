package com.chikage.leetcode;

import java.util.concurrent.locks.LockSupport;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: LockSupportDemo
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/2/17 5:04 PM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class LockSupportDemo {
    public static void main(String[] args) {
//        LockSupport.park();
//        System.out.println("block~");
        Thread thread = Thread.currentThread();
        LockSupport.unpark(thread);//释放许可
        LockSupport.park();// 获取许可
        System.out.println("b");

    }
}
