package com.charles.smile.order.query;

import com.alibaba.cola.dto.SingleResponse;
import com.charles.smile.assembler.OrderAssembler;
import com.charles.smile.domain.gateway.OrderGateway;
import com.charles.smile.domain.order.OrderEntity;
import com.charles.smile.dto.data.OrderVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author charles
 * @date 2023/5/16 23:59
 */
@Slf4j
@Component
@AllArgsConstructor
public class OrderItemQueryExe {

    private final OrderGateway orderGateway;

    public SingleResponse<OrderVo> execute(Long id) {
        OrderEntity order = orderGateway.findById(id);
        return SingleResponse.of(OrderAssembler.toOrderVO(order));
    }
}
