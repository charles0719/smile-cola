package com.charles.smile.domain.gateway;

import com.charles.smile.domain.customer.Customer;
import com.charles.smile.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
