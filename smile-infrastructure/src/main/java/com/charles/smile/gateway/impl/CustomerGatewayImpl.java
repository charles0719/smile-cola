package com.charles.smile.gateway.impl;

import com.charles.smile.gateway.impl.dataobject.CustomerDO;
import com.charles.smile.domain.customer.Customer;
import com.charles.smile.domain.gateway.CustomerGateway;

import com.charles.smile.gateway.impl.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerGatewayImpl implements CustomerGateway {
    @Autowired
    private CustomerMapper customerMapper;

    public Customer getByById(String customerId){
      CustomerDO customerDO = customerMapper.getById(customerId);
      //Convert to Customer
      return null;
    }
}
