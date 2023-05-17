package com.charles.smile.exception;

import com.alibaba.cola.exception.BizException;
import com.charles.smile.dto.data.ErrorCode;

/**
 * @author charles
 * @date 2023/5/17 11:08
 */
public class OrderBizException extends BizException {

    public OrderBizException(ErrorCode errorCode) {
        super(errorCode.getErrCode(), errorCode.getErrDesc());
    }
}
