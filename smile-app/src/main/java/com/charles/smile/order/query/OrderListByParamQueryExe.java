package com.charles.smile.order.query;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.charles.smile.assembler.OrderAssembler;
import com.charles.smile.domain.gateway.OrderGateway;
import com.charles.smile.domain.order.OrderEntity;
import com.charles.smile.dto.data.IPageResponse;
import com.charles.smile.dto.data.OrderVo;
import com.charles.smile.dto.query.OrderListByParamQuery;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class OrderListByParamQueryExe {

    private final OrderGateway orderGateway;

    public IPageResponse<OrderVo> execute(OrderListByParamQuery query) {
        IPage<OrderEntity> page = orderGateway.page(query);
        return IPageResponse.of(page.convert(OrderAssembler::toOrderVO));
    }
}
