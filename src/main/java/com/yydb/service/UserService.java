package com.yydb.service;

import com.yydb.models.User;
import com.yydb.models.UserAddress;

import java.util.List;

/**
 * UserService用户服务层接口
 *
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/10/28
 * Time: 23:50
 */
public interface UserService {

    /**
     * 查询购买记录
     */
    //public User purchaseRecords(User user);

    /**
     * 获取收货地址
     * @param user
     * @return userAddress
     */
    public List<UserAddress> shipAddress(User user);
}
