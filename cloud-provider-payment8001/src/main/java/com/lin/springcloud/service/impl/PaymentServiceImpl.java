package com.lin.springcloud.service.impl;

import com.lin.springcloud.dao.PaymentDao;
import com.lin.springcloud.entities.Payment;
import com.lin.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: lin lessbug
 * @Time: 2021/6/22  15:01
 * @descrtiption:
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return  paymentDao.getPaymentById(id);
    }
}
