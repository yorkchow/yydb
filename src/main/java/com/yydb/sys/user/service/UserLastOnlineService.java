package com.yydb.sys.user.service;

import com.yydb.common.service.BaseService;
import com.yydb.sys.user.entity.UserLastOnline;
import com.yydb.sys.user.repository.UserLastOnlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/3
 * Time: 0:09
 */
@Service
public class UserLastOnlineService extends BaseService<UserLastOnline, Long> {

    private UserLastOnlineRepository getUserLastOnlineRepository() {
        return (UserLastOnlineRepository) baseRepository;
    }


    public UserLastOnline findByUserId(Long userId) {
        return getUserLastOnlineRepository().findByUserId(userId);
    }

    public void lastOnline(UserLastOnline lastOnline) {
        UserLastOnline dbLastOnline = findByUserId(lastOnline.getUserId());

        if (dbLastOnline == null) {
            dbLastOnline = lastOnline;
        } else {
            UserLastOnline.merge(lastOnline, dbLastOnline);
        }
        dbLastOnline.incLoginCount();
        dbLastOnline.incTotalOnlineTime();
        //相对于save or update
        save(dbLastOnline);
    }
}
