package com.chikage.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: QuickSortTest
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/3/20 1:30 PM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class QuickSortTest {

    public static void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n - 1);

    }

    private static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition(a, p, r);
        quickSortInternally(a, p, q - 1);
        quickSortInternally(a, q + 1, r);
    }

    private static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; ++j) {
            if (a[j] < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    ++i;
                }
            }

//            int tmp = a[i]; 不能放这里
//            a[i] = a[r];
//            a[r] = tmp;

        }
        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;

//        System.out.println("i=" + i);
        return i;

    }


    @Test
    public void quickSortTest(){ //不是稳定排序算法
        int[] a = {2,3,345,64,86,2,85,24,22,67,794,24,2};
        quickSort(a, a.length);


       Arrays.stream(a).forEach(System.out::println);


    }
}
