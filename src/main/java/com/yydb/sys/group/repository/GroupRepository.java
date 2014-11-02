package com.yydb.sys.group.repository;

import com.yydb.common.repository.BaseRepository;
import com.yydb.sys.group.entity.Group;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/3
 * Time: 0:52
 */
public interface GroupRepository extends BaseRepository<Group, Long> {

    @Query("select id from Group where defaultGroup=true and show=true")
    List<Long> findDefaultGroupIds();
}
