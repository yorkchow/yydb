package com.yydb.maintain.icon.repository;

import com.yydb.common.repository.BaseRepository;
import com.yydb.maintain.icon.entity.Icon;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/10/28
 * Time: 23:50
 */
public interface IconRepository extends BaseRepository<Icon, Long> {
    Icon findByIdentity(String identity);
}
