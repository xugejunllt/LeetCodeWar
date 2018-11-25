package com.chikage.leetcode;

import java.util.Arrays;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: MergeSortDemo
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2018/11/25 11:55 PM
 * @version: v1.0
 * @copyright: 2018 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MergeSort {

    //a为数组,n为数组大小
    public static void mergeSort(int a[], int n) {
        mergesortInternally(a, 0, n - 1);
    }

    private static void mergesortInternally(int[] a, int p, int r) {
        if (p >= r) return;
        int q = p + (r - p) / 2;
        //分而治之
        mergesortInternally(a, p, q);
        mergesortInternally(a, q + 1, r);
        //合并
        merge(a, p, q, r);

    }

    private static void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int k = 0;
        int[] tmp = new int[r - p + 1];

        //将分组中的较小值放入临时数组
        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }
        //判断哪个子数组中有剩余的数据
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }
        //将剩余的有值的子数组放进临时数组中
        while (start <= end) {
            tmp[k++] = a[start++];
        }
        //将临时数组放进原始数组中
        for (i = 0; i <= r - p; i++) {
            a[p + i] = tmp[i];
        }

    }

    public static void main(String[] args) {
        int[] data = {2, 5, 6, 8, 31, 45, 1, 13, 42,324,2,1,141,435,13,123,25,123,5,11,424,46,47,5,8,6,8686,8};
//        insertionSort(data);
        long start = System.currentTimeMillis();
        mergeSort(data,data.length);
        Arrays.stream(data).forEach(System.out::println);
        System.out.println("时间:"+(System.currentTimeMillis()-start)+ "ms");
    }
}
