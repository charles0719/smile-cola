package com.charles.smile.gateway.impl.mapper;

import com.charles.smile.gateway.impl.dataobject.CustomerDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper{

  public CustomerDO getById(String customerId);
}
