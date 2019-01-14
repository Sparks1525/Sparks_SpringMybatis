package com.xmg.test;

import com.xmg.domain.User;
import com.xmg.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by kerwin on 2017/9/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class UserServiceTest {
    @Autowired
    private IUserService service;
    @Test
    public void testSave(){
        User u = new User();
        service.add(u);
    }
}
