package com.yydb.extra.task;

import com.yydb.sys.auth.task.AuthRelationClearTask;
import com.yydb.sys.group.task.GroupClearRelationTask;
import com.yydb.sys.user.task.UserClearRelationTask;
import com.yydb.sys.permission.task.RoleClearRelationTask;
import com.yydb.sys.user.task.UserClearRelationTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 定时清理对象间的关系
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/2
 * Time: 22:57
 */
@Service("relationClearTask")
public class RelationClearTask {

    @Autowired
    private UserClearRelationTask userClearRelationTask;

    @Autowired
    private GroupClearRelationTask groupClearRelationTask;

    @Autowired
    private RoleClearRelationTask roleClearRelationTask;

    @Autowired
    private AuthRelationClearTask authRelationClearTask;

    public void autoClearRelation() {

        //用户与组织机构/工作职务的关系
        userClearRelationTask.clearDeletedUserRelation();

        //分组与组织机构/工作职务的关系
        groupClearRelationTask.clearDeletedGroupRelation();


        //角色与资源/权限的关系
        roleClearRelationTask.clearDeletedRoleRelation();

        //授权与组织机构、组、角色的关系
        authRelationClearTask.clearDeletedAuthRelation();
    }
}
