package com.charles.smile.web;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.charles.smile.api.OrderServiceI;
import com.charles.smile.dto.OrderAddCmd;
import com.charles.smile.dto.OrderEditCmd;
import com.charles.smile.dto.data.IPageResponse;
import com.charles.smile.dto.data.OrderVo;
import com.charles.smile.dto.query.OrderListByParamQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author charles
 * @date 2023/5/16 23:06
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderServiceI orderService;

    @PostMapping("/add")
    public Response add(@Validated @RequestBody OrderAddCmd cmd) {
        orderService.add(cmd);
        return Response.buildSuccess();
    }

    @PostMapping("/edit")
    public Response update(@Validated @RequestBody OrderEditCmd cmd) {
        orderService.edit(cmd);
        return Response.buildSuccess();
    }

    @PostMapping("/page")
    public IPageResponse<OrderVo> page(@RequestBody OrderListByParamQuery query) {
        return orderService.page(query);
    }

    @GetMapping("/{id}")
    public SingleResponse<OrderVo> one(@PathVariable(name = "id") Long id) {
        return orderService.one(id);
    }
}
