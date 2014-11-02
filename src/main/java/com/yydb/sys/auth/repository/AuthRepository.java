package com.yydb.sys.auth.repository;

import com.yydb.common.repository.BaseRepository;
import com.yydb.sys.auth.entity.Auth;

import java.util.Set;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/3
 * Time: 1:05
 */
public interface AuthRepository extends BaseRepository<Auth, Long> {

    Auth findByUserId(Long userId);

    Auth findByGroupId(Long groupId);

    Auth findByOrganizationIdAndJobId(Long organizationId, Long jobId);

    ///////////委托给AuthRepositoryImpl实现
    public Set<Long> findRoleIds(Long userId, Set<Long> groupIds, Set<Long> organizationIds, Set<Long> jobIds, Set<Long[]> organizationJobIds);
}
