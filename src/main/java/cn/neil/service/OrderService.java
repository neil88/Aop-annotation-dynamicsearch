package cn.neil.service;


import cn.neil.Annotation.NeedSetFiledValue;
import cn.neil.mapper.OrderMapper;
import cn.neil.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    // 使用注解定在需要的方法上
    @NeedSetFiledValue
    public List<Order> getAllOrder() {
        List<Order> orderList = orderMapper.getAllOrder();
        return orderList;
    }
}

