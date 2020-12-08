package com.lwf.example.sharding.service;

import com.lwf.example.sharding.entity.OrderEntity;
import com.lwf.example.sharding.repository.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liweifan
 * @date 2020-06-18
 */
@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;

    public void save(OrderEntity entity) {
        orderRepository.save(entity);
    }

}
