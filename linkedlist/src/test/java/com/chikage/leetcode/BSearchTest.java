package com.chikage.leetcode;

import org.junit.Test;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: BSortTest
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/3/20 3:30 PM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class BSearchTest {


    /**
     * 数组里没有重复数据，且是有序的
     */

    public static int normalBSearch(int[] a, int n, int value) {
        int hign = n - 1;
        int low = 0;

        while (low <= hign) {
            int mid = low + ((hign - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                hign = mid - 1;
            }
        }
        return -1;
    }


    @Test
    public void testNormalBSearch() {
        int[] a = {2, 3, 4, 64, 85, 100, 109, 120, 239, 290, 330, 1212};
        int i = normalBSearch(a, a.length, 120);
        System.out.println(i);
    }


    /**
     * 查找第一个等于指定值的元素
     *
     * @param a
     * @param n
     * @param value
     * @return
     */
    public static int AfindBSearch(int[] a, int n, int value) {
        int hign = n - 1;
        int low = 0;
        while (low <= hign) {
            int mid = low + ((hign - low) >> 1);
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                hign = mid - 1;
            } else {
                if (mid == 0 || a[mid - 1] != value) return mid;
                hign = mid - 1;
            }
        }
        return -1;
    }

    @Test
    public void testAfindBSearch() {
        int[] a = {2, 3, 4, 64, 85, 100, 109, 120, 120, 120, 239, 290, 330, 1212};
        int i = AfindBSearch(a, a.length, 120);
        System.out.println(i);
    }


}
