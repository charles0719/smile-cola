package com.charles.smile.gateway.impl.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author charles
 * @date 2023/5/17 0:11
 */
@TableName("app_order")
@Data
public class OrderDO {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String orderInfo;

    private String orderNo;

    private String description;

    private Date createTime;
}
