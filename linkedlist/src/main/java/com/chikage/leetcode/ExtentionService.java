package com.chikage.leetcode;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: TestCase
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/4/11 10:20 PM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ExtentionService implements PaymentRemoteSerivce {

    @Override
    public ConsultResult isEnabled(String paymentType) { //假设1，2可用
        if("1".equals(paymentType)||"2".equals(paymentType)){
            return new ConsultResult(true,"success");
        }

        return new ConsultResult(false,"fail");

    }
}
