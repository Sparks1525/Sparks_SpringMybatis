package com.xmg.service;

import com.xmg.domain.User;
import com.xmg.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by kerwin on 2017/9/18.
 */
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(User u) {
        userMapper.add(u);
    }

    @Override
    public void update(User u) {
        userMapper.update(u);
    }

    @Override
    public User get(long id) {
        return userMapper.get(id);
    }

    @Override
    public void delete(long id) {
        userMapper.delete(id);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
