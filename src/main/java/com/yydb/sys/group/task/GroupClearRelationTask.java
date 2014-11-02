package com.yydb.sys.group.task;

import com.yydb.sys.group.repository.GroupRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 清理无关联的关系
 * 1、Group-GroupRelation
 * 2、GroupRelation-User
 * 3、GroupRelation-Organization
 * 4、GroupRelation-Job
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/2
 * Time: 23:06
 */
@Service
public class GroupClearRelationTask {

    @Autowired
    private GroupRelationRepository groupRelationRepository;

    /**
     * 清除删除的分组对应的关系
     */
    public void clearDeletedGroupRelation() {
        groupRelationRepository.clearDeletedGroupRelation();
    }
}
