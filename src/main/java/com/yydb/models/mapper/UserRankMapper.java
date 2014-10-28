package com.yydb.models.mapper;

import com.yydb.models.UserRank;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * UserRankMapper用户等级DAO
 *
 * @author: York Chow<york.chow@actionsky.com>
 * @since: 2014/10/28
 * Time: 15:42
 */
@Service
public interface UserRankMapper {

    @Select("SELECT id,name,min_points minPoints,max_points maxPoints,special_rank specialRank FROM yydb_user_rank WHERE id=#{rankId}")
    UserRank getById(@Param("rankId") int rankId);
}
