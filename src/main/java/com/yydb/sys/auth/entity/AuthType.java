package com.yydb.sys.auth.entity;

/**
 * 授权类型
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/3
 * Time: 1:04
 */
public enum AuthType {

    user("用户"), user_group("用户组"), organization_job("组织机构和工作职务"), organization_group("组织机构组");

    private final String info;

    private AuthType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
