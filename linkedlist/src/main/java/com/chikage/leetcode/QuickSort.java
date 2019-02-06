package com.chikage.leetcode;

import java.util.Arrays;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: QuickSort
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/2/6 10:39 AM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 */
public class QuickSort {

    public static void quickSort(int[] a,int n){
        quickSortInternally(a, 0, n - 1);
    }

    private static void quickSortInternally(int[] a, int p, int r) {
        if(p>=r) return;
        int q = partition(a, p, r);
        quickSortInternally(a, p, q - 1);
        quickSortInternally(a, q + 1, r);
    }

    private static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for(int j=i;j<r;++j){
            if (a[j] < pivot) {
                if(i==j){
                    ++i;
                }else {
                    int tmp = a[i];
                    a[i++]=a[j];
                    a[j] = tmp;
                }
            }
        }
        int tmp = a[i];
        a[i]=a[r];
        a[r] = tmp;

        System.out.println("i=" + i);
        return i;
    }


    public static void main(String[] args) {
        int[] data = {2, 5, 6, 8, 31, 45, 1, 13, 42, 324, 2, 1, 141, 435, 13, 123, 25, 123, 5, 11, 424, 46, 47, 5, 8, 6, 8686, 8};
//        insertionSort(data);
        long start = System.currentTimeMillis();
//        shellSort(data,5);
        quickSort(data,data.length);
        Arrays.stream(data).forEach(System.out::println);
        System.out.println("时间:" + (System.currentTimeMillis() - start) + "ms");
    }
}
