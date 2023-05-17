package com.charles.smile.dto;

import com.alibaba.cola.dto.Command;
import lombok.Data;

/**
 * @author charles
 * @date 2023/5/16 23:13
 */
@Data
public class OrderAddCmd extends Command {

    private String orderInfo;

    private String orderNo;

    private String description;
}
