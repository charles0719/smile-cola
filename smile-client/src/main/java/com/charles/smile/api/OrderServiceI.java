package com.charles.smile.api;

import com.alibaba.cola.dto.SingleResponse;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.charles.smile.dto.OrderAddCmd;
import com.charles.smile.dto.OrderEditCmd;
import com.charles.smile.dto.data.IPageResponse;
import com.charles.smile.dto.data.OrderVo;
import com.charles.smile.dto.query.OrderListByParamQuery;

/**
 * @author charles
 * @date 2023/5/16 23:07
 */
public interface OrderServiceI {

    OrderVo add(OrderAddCmd orderAddCmd);

    OrderVo edit(OrderEditCmd orderEditCmd);

    IPageResponse<OrderVo> page(OrderListByParamQuery query);

    SingleResponse<OrderVo> one(Long id);
}
