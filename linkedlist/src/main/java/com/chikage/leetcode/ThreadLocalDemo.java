package com.chikage.leetcode;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: ThreadLocalDemo
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/2/13 1:40 AM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ThreadLocalDemo {
    static ThreadLocal<String> tl = new ThreadLocal<>();
//    static ThreadLocal<Integer> tl2 = new ThreadLocal<>();


    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            tl.set("thread 1 locals");
            System.out.println("thread 1 :"+ tl.get());
        });
        Thread thread2 = new Thread(()->{
            tl.set("thread 2 locals");
            System.out.println("thread 2 :"+ tl.get());
        });
        thread1.start();
        thread2.start();
    }




//    public static void main(String[] args) {
//        Thread thread1 = new Thread(() -> {
//            tl.set("thread 1 locals");
//            System.out.println("thread 1 :"+tl.get());
//        });
//
//        Thread thread2 = new Thread(() -> {
//            tl2.set(999);
//            System.out.println("thread 1 :" + tl2.get());
//        });
//        thread1.start();
//        thread2.start();
//    }


}
