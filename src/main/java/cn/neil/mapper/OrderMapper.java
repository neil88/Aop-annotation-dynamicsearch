package cn.neil.mapper;

import cn.neil.pojo.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
//模拟查询数据库
public class OrderMapper {
    public List<Order> getAllOrder(){
        List<Order> orders = new ArrayList<>();
        Order o1 = new Order().setId(1).setCustomerId(1);
        orders.add(o1);
        Order o2 = new Order().setId(2).setCustomerId(2);
        orders.add(o2);
        Order o3 = new Order().setId(3).setCustomerId(3);
        orders.add(o3);

        return orders;
}
}
