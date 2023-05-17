package com.charles.smile.domain.gateway;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.charles.smile.domain.order.OrderEntity;
import com.charles.smile.dto.query.OrderListByParamQuery;

/**
 * @author charles
 * @date 2023/5/16 23:36
 */
public interface OrderGateway {
    IPage<OrderEntity> page(OrderListByParamQuery query);

    OrderEntity save(OrderEntity toAddEntity);

    OrderEntity findById(Long id);
}
