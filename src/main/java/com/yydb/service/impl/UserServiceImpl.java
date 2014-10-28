package com.yydb.service.impl;

import com.yydb.models.User;
import com.yydb.models.UserAddress;
import com.yydb.models.mapper.UserAddressMapper;
import com.yydb.models.mapper.UserMapper;
import com.yydb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * UserServiceImpl用户服务层实现
 *
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/10/29
 * Time: 0:01
 */
@Transactional(propagation= Propagation.REQUIRED, readOnly=false)
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserAddress> shipAddress(User user) {
        return userAddressMapper.getByUserId(user.getId());
    }
}
