create table app_order
(
    id          bigint auto_increment comment '主键'
        primary key,
    order_info  varchar(100) null comment '当前执行人',
    order_no    varchar(60)  null comment '订单号',
    description varchar(200) null comment '订单描述',
    create_time datetime     null comment '创建时间'
)
    comment '订单表';