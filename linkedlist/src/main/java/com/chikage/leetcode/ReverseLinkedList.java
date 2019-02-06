package com.chikage.leetcode;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: ReverseLinkedList
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2018/11/18 11:56 PM
 * @version: v1.0
 * */
public class ReverseLinkedList {
    public static class Node<E> {
        int val;
        Node<E> next;

        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static Node reverse(Node<Integer> list) {
        Node head = null;
        Node tmp = null;
        Node p = list;
        while (p != null) {
            Node next = p.next;
            if (next == null) {
                head = p;
            }
            p.next = tmp;
            tmp = p;
            p = next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println(n1);
        System.out.println(reverse(n1));
    }
}
