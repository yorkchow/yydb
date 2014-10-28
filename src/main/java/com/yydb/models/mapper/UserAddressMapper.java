package com.yydb.models.mapper;

import com.yydb.models.User;
import com.yydb.models.UserAddress;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserAddressMapper收货地址DAO
 *
 * @author: York Chow<york.chow@actionsky.com>
 * @since: 2014/10/28
 * Time: 16:55
 */
@Service
public interface UserAddressMapper {

    @Select("SELECT * FROM yydb_user_address WHERE user_id=#{userId}")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "consignee", column = "consignee"),
            @Result(property = "country", column = "country"),
            @Result(property = "province", column = "province"),
            @Result(property = "city", column = "city"),
            @Result(property = "district", column = "district"),
            @Result(property = "address", column = "address"),
            @Result(property = "zipcode", column = "zipcode"),
            @Result(property = "tel", column = "tel"),
            @Result(property = "mobilePhone", column = "mobilePhone"),
            @Result(property = "bestTime", column = "bestTime"),
            @Result(property = "user", column = "user_id", javaType = User.class,
                    one = @One(select = "com.yydb.models.mapper.UserMapper.getById"))
    })
    List<UserAddress> getByUserId(@Param("userId") int userId);

    @Select("SELECT * FROM yydb_user_address WHERE id=#{addressId}")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "consignee", column = "consignee"),
            @Result(property = "country", column = "country"),
            @Result(property = "province", column = "province"),
            @Result(property = "city", column = "city"),
            @Result(property = "district", column = "district"),
            @Result(property = "address", column = "address"),
            @Result(property = "zipcode", column = "zipcode"),
            @Result(property = "tel", column = "tel"),
            @Result(property = "mobilePhone", column = "mobilePhone"),
            @Result(property = "bestTime", column = "bestTime"),
            @Result(property = "user", column = "user_id", javaType = User.class,
                    one = @One(select = "com.yydb.models.mapper.UserMapper.getById"))
    })
    UserAddress getById(@Param("addressId") int addressId);
}
