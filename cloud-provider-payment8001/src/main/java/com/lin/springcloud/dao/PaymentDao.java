package com.lin.springcloud.dao;

import com.lin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: lin lessbug
 * @Time: 2021/6/22  14:34
 * @descrtiption: namespace那里点进去回来到这里 mapper注解！！不要漏
 **/
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id")Long id);
}
