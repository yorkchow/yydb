package com.yydb.sys.permission.repository;

import com.yydb.common.repository.BaseRepository;
import com.yydb.sys.permission.entity.Role;
import com.yydb.sys.permission.entity.RoleResourcePermission;
import org.springframework.data.jpa.repository.Query;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/3
 * Time: 0:18
 */
public interface RoleRepository extends BaseRepository<Role, Long> {

    @Query("from RoleResourcePermission where role=?1 and resourceId=?2")
    RoleResourcePermission findRoleResourcePermission(Role role, Long resourceId);
}
