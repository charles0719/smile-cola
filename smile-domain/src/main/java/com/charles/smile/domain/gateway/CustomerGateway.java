package com.charles.smile.domain.gateway;

import com.charles.smile.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
