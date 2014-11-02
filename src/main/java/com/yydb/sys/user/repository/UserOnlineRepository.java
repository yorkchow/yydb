/**
 * Copyright (c) 2005-2013 https://github.com/yorkchow
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.yydb.sys.user.repository;

import com.yydb.common.repository.BaseRepository;
import com.yydb.sys.user.entity.UserOnline;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/3
 * Time: 0:09
 */
public interface UserOnlineRepository extends BaseRepository<UserOnline, String> {

    @Query("from UserOnline o where o.lastAccessTime < ?1 order by o.lastAccessTime asc")
    Page<UserOnline> findExpiredUserOnlineList(Date expiredDate, Pageable pageable);

    @Modifying
    @Query("delete from UserOnline o where o.id in (?1)")
    void batchDelete(List<String> needExpiredIdList);
}
