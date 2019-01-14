package com.xmg.service;

import com.xmg.domain.User;

import java.util.List;

/**
 * Created by kerwin on 2017/9/18.
 */
public interface IUserService {
    void add(User u);

    void update(User u);

    User get(long id);

    void delete(long id);

    List<User> list();
}
