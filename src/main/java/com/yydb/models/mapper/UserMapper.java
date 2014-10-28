package com.yydb.models.mapper;

import com.yydb.models.UserRank;
import com.yydb.models.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Mapper UserMapper
 *
 * @author: York Chow<york.chow@actionsky.com>
 * @since: 2014/10/28
 * Time: 15:52
 */
@Service
public interface UserMapper {

    @Select("SELECT * FROM yydb_user WHERE id=#{userId}")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "email", column = "email"),
            @Result(property = "name", column = "name"),
            @Result(property = "password", column = "password"),
            @Result(property = "money", column = "money"),
            @Result(property = "payPoints", column = "pay_points"),
            @Result(property = "rankPoints", column = "rank_points"),
            @Result(property = "regTime", column = "reg_time"),
            @Result(property = "lastLogin", column = "last_login"),
            @Result(property = "lastIp", column = "last_ip"),
            @Result(property = "visitCount", column = "visit_count"),
            @Result(property = "parentId", column = "parent_id"),
            @Result(property = "mobilePhone", column = "mobile_phone"),
            @Result(property = "isValidated", column = "is_validated"),
            @Result(property = "rank", column = "rank_id", javaType = UserRank.class,
                    one = @One(select = "com.yydb.models.mapper.UserRankMapper.getById")),
            @Result(property = "userAddresses", column = "id", javaType = List.class,
                    many = @Many(select = "com.yydb.models.mapper.UserAddressMapper.getByUserId"))
    })
    User getById(@Param("userId") int userId);
}
