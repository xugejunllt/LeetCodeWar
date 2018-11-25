package com.chikage.leetcode;

import java.util.Arrays;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: InsertionSortDemo
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2018/11/25 9:03 PM
 * @version: v1.0
 * @copyright: 2018 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class InsertionSortDemo {
    public static void insertionSort(int[] a) {
        int n = a.length;
        if (n <= 1) return;
        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                }else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        int[] data = {2, 5, 6, 8, 31, 45, 1, 13, 42};
        insertionSort(data);
        Arrays.stream(data).forEach(System.out::println);
    }
}
