package com.chikage.leetcode;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: BubbleSort
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/2/5 7:35 PM
 * @version: v1.0
 */
public class BubbleSort {

    private String a;

    public void setA(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        if (n <= 1) return;
        for (int i = 0; i < n; ++i) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            if(!flag) break;
        }

    }

    public static void main(String[] args) {
//        int[] data = {2, 5, 6, 8, 31, 45, 1, 13, 42,324,2,1,141,435,13,123,25,123,5,11,424,46,47,5,8,6,8686,8};
////        insertionSort(data);
//        long start = System.currentTimeMillis();
//        bubbleSort(data);
//        Arrays.stream(data).forEach(System.out::println);
//        System.out.println("时间:"+(System.currentTimeMillis()-start)+ "ms");
        BubbleSort a = new BubbleSort();
        a.setA("1");

        BubbleSort b = new BubbleSort();
        b.setA("2");


        System.out.println(a.getA());
        System.out.println(b.getA());
    }
}
