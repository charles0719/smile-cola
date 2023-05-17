package com.charles.smile.assembler;

import com.charles.smile.domain.order.OrderEntity;
import com.charles.smile.dto.OrderAddCmd;
import com.charles.smile.dto.OrderEditCmd;
import com.charles.smile.dto.data.OrderVo;

public class OrderAssembler {
    public static OrderEntity toAddEntity(OrderAddCmd cmd) {
        OrderEntity OrderEntity = new OrderEntity();
        OrderEntity.setOrderNo(cmd.getOrderNo());
        OrderEntity.setOrderInfo(cmd.getOrderInfo());
        OrderEntity.setDescription(cmd.getDescription());
        return OrderEntity;
    }

    public static OrderVo toOrderVO(OrderEntity entity) {
        OrderVo orderVo = new OrderVo();
        orderVo.setId(entity.getId());
        orderVo.setOrderInfo(entity.getOrderInfo());
        orderVo.setOrderNo(entity.getOrderNo());
        orderVo.setDescription(entity.getDescription());
        return orderVo;

    }

    public static OrderEntity toUpdateEntity(OrderEditCmd cmd) {
        OrderEntity OrderEntity = new OrderEntity();
        OrderEntity.setId(cmd.getId());
        OrderEntity.setOrderNo(cmd.getOrderNo());
        OrderEntity.setOrderInfo(cmd.getOrderInfo());
        OrderEntity.setDescription(cmd.getDescription());
        return OrderEntity;
    }
}