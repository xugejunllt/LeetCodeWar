package com.chikage.leetcode;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: SyncDemo
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/2/15 5:55 PM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SyncDemo {
    private final Sync sync = new Sync();

    public void lock() {
        sync.acquire(1);
    }

    public void unlock() {
        sync.release(1);
    }


    private static class Sync extends AbstractQueuedSynchronizer {

        /**
         * 当state为0的时候尝试获取同步状态
         *
         * @param arg
         * @return
         */
        @Override
        protected boolean tryAcquire(int arg) {
            if (compareAndSetState(0, 1)) { //CAS更新state的值
                setExclusiveOwnerThread(Thread.currentThread()); //设置占用排它锁的线程是当前线程
                return true;
            }
            return false;
        }

        /**
         * 尝试释放同步状态，将state设置为0
         *
         * @param arg
         * @return
         */
        @Override
        protected boolean tryRelease(int arg) {
            setState(0);
            setExclusiveOwnerThread(null);
            return true;
        }

        /**
         * 是否处于独占状态
         *
         * @return
         */
        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }
    }
}
