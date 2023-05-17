package com.charles.smile.dto.data;

import com.alibaba.cola.dto.DTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author charles
 * @date 2023/5/16 23:21
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderVo extends DTO {

    private Long id;

    private String orderInfo;

    private String orderNo;

    private String description;
}
