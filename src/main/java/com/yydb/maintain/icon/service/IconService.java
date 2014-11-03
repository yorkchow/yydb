package com.yydb.maintain.icon.service;

import com.yydb.common.service.BaseService;
import com.yydb.maintain.icon.entity.Icon;
import com.yydb.maintain.icon.repository.IconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/10/28
 * Time: 23:50
 */
@Service
public class IconService extends BaseService<Icon, Long> {

    private IconRepository getIconRepository() {
        return (IconRepository) baseRepository;
    }

    public Icon findByIdentity(String identity) {
        return getIconRepository().findByIdentity(identity);
    }
}
