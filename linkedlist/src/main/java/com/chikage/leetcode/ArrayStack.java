package com.chikage.leetcode;

import java.util.Arrays;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: ArrayStack
 * @package: com.chikage.leetcode
 * @description: 用数组实现栈
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2018/12/7 10:49 AM
 * @version: v1.0
 * @copyright: 2018 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ArrayStack {
    private String[] items;//数组
    private int count;//栈的元素个数
    private int n;//栈大小

    //初始化一个数组，申请一个大小为n的数组空间
    public ArrayStack(int n) {
        this.items = new String[n];
        this.count = 0;
        this.n = n;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                ", n=" + n +
                '}';
    }

    //入栈操作
    public boolean push(String item) {
        //数组空间不够，直接返回false
        if (count == n) return false;
        //将item放到下标为count的位置，并且count加1
        items[count] = item;
        ++count;
        return true;
    }


    //出栈操作
    public String pop() {
        //数组为空，直接返回null
        if (count == 0) return null;
        //将下标为count-1的数组元素返回，并且count减1
        String tmp = items[count - 1];
        --count;
        return tmp;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");
        System.out.println(stack);
        System.out.println(stack.pop());
    }
}
