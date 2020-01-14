package cn.neil.mapper;

import cn.neil.pojo.User;
import org.springframework.stereotype.Repository;

//模拟查询数据库
@Repository
public class UserMapper {

    public User getUserById(Integer customerId) {
        User u = new User();
        u.setId(Long.valueOf(customerId)).setName("用户:"+customerId);
        return u;
    }
}
