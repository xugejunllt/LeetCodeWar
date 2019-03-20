package com.chikage.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: InsertSortTest
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/3/20 11:53 AM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class InsertSortTest {

    public void insertSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];

                }else {
                    break;
                }
            }

            a[j + 1] = value;
        }
    }

    @Test
    public void insertSortTest(){
        int[] a = {2,3,345,64,86,2,85,24,22,67,794,24,2};
        insertSort(a, a.length);
        Arrays.stream(a).forEach(System.out::println);
    }
}
