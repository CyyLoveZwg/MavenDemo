package service.impl;

import mapper.UserMapper;
import model.User;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Roger on 2015/9/17.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public void createUser() {
        User user = new User();
        user.setId(3);
        user.setName("小四");
        userMapper.createUser(user);
    }
}
