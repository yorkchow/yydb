/**
 * Copyright (c) 2005-2013 https://github.com/yorkchow
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.yydb.sys.user.repository;

import com.yydb.common.repository.BaseRepository;
import com.yydb.common.repository.support.annotation.SearchableQuery;
import com.yydb.sys.user.entity.User;
import com.yydb.sys.user.entity.UserOrganizationJob;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/3
 * Time: 0:09
 */
@SearchableQuery(callbackClass = UserSearchCallback.class)
public interface UserRepository extends BaseRepository<User, Long> {

    User findByUsername(String username);

    User findByMobilePhoneNumber(String mobilePhoneNumber);

    User findByEmail(String email);

    @Query("from UserOrganizationJob where user=?1 and organizationId=?2 and jobId=?3")
    UserOrganizationJob findUserOrganization(User user, Long organizationId, Long jobId);


    @Query("select uoj from UserOrganizationJob uoj where not exists(select 1 from Job j where uoj.jobId=j.id) or not exists(select 1 from Organization o where uoj.organizationId=o.id)")
    Page<UserOrganizationJob> findUserOrganizationJobOnNotExistsOrganizationOrJob(Pageable pageable);

    @Modifying
    @Query("delete from UserOrganizationJob uoj where not exists(select 1 from User u where uoj.user=u)")
    void deleteUserOrganizationJobOnNotExistsUser();
}
