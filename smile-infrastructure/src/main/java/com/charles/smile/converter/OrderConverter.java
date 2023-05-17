package com.charles.smile.converter;

import com.charles.smile.domain.order.OrderEntity;
import com.charles.smile.gateway.impl.dataobject.OrderDO;

import java.util.Date;

/**
 * @author charles
 * @date 2023/5/17 0:08
 */
public class OrderConverter {

    public static OrderDO toOrderDO(OrderEntity order) {
        OrderDO orderDO = new OrderDO();
        orderDO.setId(order.getId());
        orderDO.setOrderInfo(order.getOrderInfo());
        orderDO.setOrderNo(order.getOrderNo());
        orderDO.setDescription(order.getDescription());
        orderDO.setCreateTime(new Date());
        return orderDO;
    }

    public static OrderEntity toOrderEntity(OrderDO orderDo) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(orderDo.getId());
        orderEntity.setOrderInfo(orderDo.getOrderInfo());
        orderEntity.setOrderNo(orderDo.getOrderNo());
        orderEntity.setDescription(orderDo.getDescription());
        return orderEntity;

    }
}
