package com.lin.springcloud.service;

import com.lin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: lin lessbug
 * @Time: 2021/6/22  15:01
 * @descrtiption:
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
