package com.chikage.leetcode;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: PaymentRemoteSerivce
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/4/11 9:54 PM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface PaymentRemoteSerivce {
    ConsultResult isEnabled(String paymentType);
}
