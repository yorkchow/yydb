package com.yydb.maintain.dynamictask.service;

import com.yydb.maintain.dynamictask.entity.TaskDefinition;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/10/28
 * Time: 23:50
 */
public interface DynamicTaskApi {

    public void addTaskDefinition(TaskDefinition taskDefinition);
    public void updateTaskDefinition(TaskDefinition taskDefinition);
    public void deleteTaskDefinition(boolean forceTermination, Long... taskDefinitionIds);


    public void startTask(Long... taskDefinitionIds);
    public void stopTask(boolean forceTermination, Long... taskDefinitionId);


}
