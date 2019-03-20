package com.chikage.leetcode;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: ThreadTest
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/2/7 9:02 PM
 * @version: v1.0
 */
public class ThreadTest extends Thread{
    @Override
    public void run() {
        System.out.println("123");
    }


    public static void main(String[] args) {
//        new ThreadTest().start();
        Node node = new Node(Thread.currentThread(), Node.EXCLUSIVE);
        System.out.println(node);
    }


    static final class Node {
        /** Marker to indicate a node is waiting in shared mode */
        static final ThreadTest.Node SHARED = new ThreadTest.Node();
        /** Marker to indicate a node is waiting in exclusive mode */
        static final ThreadTest.Node EXCLUSIVE = null;

        /** waitStatus value to indicate thread has cancelled */
        static final int CANCELLED =  1;
        /** waitStatus value to indicate successor's thread needs unparking */
        static final int SIGNAL    = -1;
        /** waitStatus value to indicate thread is waiting on condition */
        static final int CONDITION = -2;
        /**
         * waitStatus value to indicate the next acquireShared should
         * unconditionally propagate
         */
        static final int PROPAGATE = -3;


        volatile int waitStatus;


        volatile ThreadTest.Node prev;


        volatile ThreadTest.Node next;

        /**
         * The thread that enqueued this node.  Initialized on
         * construction and nulled out after use.
         */
        volatile Thread thread;

        ThreadTest.Node nextWaiter;

        /**
         * Returns true if node is waiting in shared mode.
         */
        final boolean isShared() {
            return nextWaiter == SHARED;
        }

        /**
         * Returns previous node, or throws NullPointerException if null.
         * Use when predecessor cannot be null.  The null check could
         * be elided, but is present to help the VM.
         *
         * @return the predecessor of this node
         */
        final ThreadTest.Node predecessor() throws NullPointerException {
            ThreadTest.Node p = prev;
            if (p == null)
                throw new NullPointerException();
            else
                return p;
        }

        Node() {    // Used to establish initial head or SHARED marker
        }

        Node(Thread thread, ThreadTest.Node mode) {     // Used by addWaiter
            this.nextWaiter = mode;
            this.thread = thread;
        }

        Node(Thread thread, int waitStatus) { // Used by Condition
            this.waitStatus = waitStatus;
            this.thread = thread;
        }
    }
}
