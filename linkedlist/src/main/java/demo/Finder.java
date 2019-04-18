package demo;

import java.util.Arrays;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: Finder
 * @package: demo
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/4/17 10:32 PM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Finder {
    public static int findKth(int[] a, int n, int K) {
        // write code here
        quickSortInternally(a, 0, n - 1);
        return a[K-1];
    }

    public static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition(a, p, r);
        quickSortInternally(a, p, q - 1);
        quickSortInternally(a, q + 1, r);
    }

    public static int partition(int[] a, int p, int r) {

        int partition = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < partition) {
                if (i == j) {
                    i++;
                } else {
                    int tmp = a[i];
                    a[i++] = a[j];
                    a[j] = tmp;
                }

            }
        }
        int t = a[i];
        a[i] = a[r];
        a[r] = t;
        return i;//此时i与r已经交换
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 2, 2};
        int kth = findKth(a, 5, 3);
        System.out.println(kth);
        Arrays.asList(a).stream().forEach(System.out::println);
    }
}
