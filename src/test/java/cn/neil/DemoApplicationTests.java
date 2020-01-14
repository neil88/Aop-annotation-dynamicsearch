package cn.neil;

import cn.neil.pojo.Order;
import cn.neil.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private OrderService orderService;

    @Test
    public void getAllOrder() {
        List<Order> allOrder = orderService.getAllOrder();
        if(allOrder !=null && allOrder.size()>0){
            for (Order o : allOrder)
                System.out.println(o);
        }
    }

}
