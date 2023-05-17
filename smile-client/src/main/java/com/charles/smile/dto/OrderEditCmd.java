package com.charles.smile.dto;

import lombok.Data;

/**
 * @author charles
 * @date 2023/5/16 23:15
 */
@Data
public class OrderEditCmd {

    private Long id;

    private String orderInfo;

    private String orderNo;

    private String description;
}
