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
    /**
     * 插入排序,稳定排序
     * @param a
     */
    public static void insertionSort(int[] a) {
        int n = a.length;
        if (n <= 1) return;
        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j]; //数据移动
                }else {
                    break; //找到插入的位置就终止循环
                }
            }
            a[j + 1] = value; //找到插入的位置插入数据
        }
    }

    /**
     * 希尔排序,插入排序的高效版,但是是非稳定排序
     * @param array
     */
    public static void shellSort(int[] array,int t) {
        int number = array.length / t;
        int i;
        int j;
        int temp;
        while (number >= 1) {
            for (i = number; i < array.length; i++) {
                temp = array[i];
                j = i - number;
                while (j >= 0 && array[j] > temp) { // 大于号，从小到大排序；小于号，倒序
                    array[j + number] = array[j];
                    j = j - number;
                }
                array[j + number] = temp;
            }
            number = number / 2;
        }
    }

    public static void main(String[] args) {
        int[] data = {2, 5, 6, 8, 31, 45, 1, 13, 42,324,2,1,141,435,13,123,25,123,5,11,424,46,47,5,8,6,8686,8};
//        insertionSort(data);
        long start = System.currentTimeMillis();
        shellSort(data,5);
        Arrays.stream(data).forEach(System.out::println);
        System.out.println("时间:"+(System.currentTimeMillis()-start)+ "ms");
    }
}
