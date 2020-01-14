package cn.neil.pojo;

import cn.neil.Annotation.NeedSetValue;
import cn.neil.mapper.UserMapper;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Order {

    private Integer id;

    private String name;

    private Integer customerId;

    // 使用注解定义在参数上
    @NeedSetValue(beanClass = UserMapper.class, params = "customerId", method = "getUserById", targetFiled = "name")
    private String customerName;

}