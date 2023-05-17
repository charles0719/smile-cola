package com.charles.smile.gateway.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.charles.smile.converter.OrderConverter;
import com.charles.smile.domain.gateway.OrderGateway;
import com.charles.smile.domain.order.OrderEntity;
import com.charles.smile.dto.data.ErrorCode;
import com.charles.smile.dto.query.OrderListByParamQuery;
import com.charles.smile.exception.OrderBizException;
import com.charles.smile.gateway.impl.dataobject.OrderDO;
import com.charles.smile.gateway.impl.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class OrderGatewayImpl implements OrderGateway {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public IPage<OrderEntity> page(OrderListByParamQuery query) {
        QueryWrapper<OrderDO> orderDOQueryWrapper = new QueryWrapper<>();
        IPage<OrderDO> page = orderMapper.selectPage(new Page<OrderDO>(query.getPageIndex(), query.getPageSize()), orderDOQueryWrapper);
        return page.convert(OrderConverter::toOrderEntity);
    }

    @Override
    public OrderEntity save(OrderEntity orderEntity) {
        // 新增
        if (Objects.isNull(orderEntity.getId())) {
            return addOrder(orderEntity);
        }

        // 修改
        return editOrder(orderEntity);
    }

    private OrderEntity editOrder(OrderEntity orderEntity) {
        OrderDO orderDo = OrderConverter.toOrderDO(orderEntity);
        orderMapper.updateById(orderDo);
        return OrderConverter.toOrderEntity(orderDo);
    }

    private OrderEntity addOrder(OrderEntity orderEntity) {
        OrderDO orderDo = OrderConverter.toOrderDO(orderEntity);
        orderMapper.insert(orderDo);
        return OrderConverter.toOrderEntity(orderDo);
    }

    @Override
    public OrderEntity findById(Long id) {
        OrderDO orderDO = orderMapper.selectById(id);
        if (Objects.isNull(orderDO)) {
            throw new OrderBizException(ErrorCode.B_ORDER_UNDEFINED);
        }
        return OrderConverter.toOrderEntity(orderDO);
    }
}
