package com.charles.smile.order;

//package by domain, not by duty


import com.alibaba.cola.dto.SingleResponse;
import com.charles.smile.api.OrderServiceI;
import com.charles.smile.dto.OrderAddCmd;
import com.charles.smile.dto.OrderEditCmd;
import com.charles.smile.dto.data.IPageResponse;
import com.charles.smile.dto.data.OrderVo;
import com.charles.smile.dto.query.OrderListByParamQuery;
import com.charles.smile.order.command.OrderAddCmdExe;
import com.charles.smile.order.command.OrderEditCmdExe;
import com.charles.smile.order.query.OrderItemQueryExe;
import com.charles.smile.order.query.OrderListByParamQueryExe;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class OrderServiceImpl implements OrderServiceI {

    @Resource
    private OrderAddCmdExe orderAddCmdExe;
    @Resource
    private OrderEditCmdExe orderEditCmdExe;

    @Resource
    private OrderListByParamQueryExe orderListByParamQueryExe;

    @Resource
    private OrderItemQueryExe orderItemQueryExe;

    @Override
    public OrderVo add(OrderAddCmd orderAddCmd) {
        return orderAddCmdExe.execute(orderAddCmd);
    }

    @Override
    public OrderVo edit(OrderEditCmd orderEditCmd) {
        return orderEditCmdExe.execute(orderEditCmd);
    }

    @Override
    public IPageResponse<OrderVo> page(OrderListByParamQuery query) {
        return orderListByParamQueryExe.execute(query);
    }

    @Override
    public SingleResponse<OrderVo> one(Long id) {
        return orderItemQueryExe.execute(id);
    }
}