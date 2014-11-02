/**
 * Copyright (c) 2005-2013 https://github.com/yorkchow
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.yydb.sys.user.repository;

import com.yydb.common.repository.BaseRepository;
import com.yydb.sys.user.entity.UserLastOnline;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/3
 * Time: 0:09
 */
public interface UserLastOnlineRepository extends BaseRepository<UserLastOnline, Long> {

    UserLastOnline findByUserId(Long userId);
}
