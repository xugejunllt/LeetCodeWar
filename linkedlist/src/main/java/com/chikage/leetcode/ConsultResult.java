package com.chikage.leetcode;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @title: ConsultResult
 * @package: com.chikage.leetcode
 * @description: ${TODO}(用一句话描述该文件做什么)
 * @author: chikage(chikagelin @ 163.com)
 * @date: 2019/4/11 9:59 PM
 * @version: v1.0
 * @copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 * 用户有多种支付方式（余额、红包、优惠券，代金券等），
 * 假如每种支付方式通过调用远程服务获取可用性。 在外部资源环境不变情况下，请设计程序以最短响应时间获得尽可能多的可用支付方式列表。
 */
public class ConsultResult {
    public ConsultResult(boolean isEnable, String errorCode) {
        this.isEnable = isEnable;
        this.errorCode = errorCode;
    }

    /**
     * 咨询结果是否可用
     */
    private boolean isEnable;

    /**
     * 错误码
     */
    private String errorCode;

    public boolean getIsEnable() {
        return isEnable;
    }

    public String getErrorCode() {
        return errorCode;
    }

}
