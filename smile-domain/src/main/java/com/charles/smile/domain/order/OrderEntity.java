package com.charles.smile.domain.order;

import com.alibaba.cola.domain.Entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author charles
 * @date 2023/5/16 23:37
 */
@Data
@Entity
public class OrderEntity {

    private Long id;

    private String orderInfo;

    private String orderNo;

    private String description;
}
