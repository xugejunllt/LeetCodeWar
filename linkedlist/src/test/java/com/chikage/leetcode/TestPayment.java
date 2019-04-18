package com.chikage.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: TestPayment
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/4/11 10:58 PM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class TestPayment {


    @Test
    public void testPayment() throws Exception {
        List<String> list = Arrays.asList("1", "2", "3", "4","2","1","2","2");//余额(1)、红包(2)、优惠券(3)，代金券(4)
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<List> future = executorService.submit(new Task(list));
        System.out.println(future.get());

    }


    private static class Task implements Callable<List> {
        private List s;

        public Task(List s) {
            this.s = s;
        }

        @Override
        public List call() {
            List collect = (List)s.parallelStream()
                    .filter(p -> new ExtentionService().isEnabled(p.toString()).getIsEnable())
                    .collect(Collectors.toList());
            return collect;
        }
    }

}
