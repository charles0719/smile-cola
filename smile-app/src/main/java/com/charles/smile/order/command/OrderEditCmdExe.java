package com.charles.smile.order.command;

import com.charles.smile.assembler.OrderAssembler;
import com.charles.smile.domain.gateway.OrderGateway;
import com.charles.smile.domain.order.OrderEntity;
import com.charles.smile.dto.OrderEditCmd;
import com.charles.smile.dto.data.OrderVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class OrderEditCmdExe {

    private final OrderGateway orderGateway;

    public OrderVo execute(OrderEditCmd cmd) {
        OrderEntity save = orderGateway.save(OrderAssembler.toUpdateEntity(cmd));
        return OrderAssembler.toOrderVO(save);
    }
}
