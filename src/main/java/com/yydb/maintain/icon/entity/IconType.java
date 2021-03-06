package com.yydb.maintain.icon.entity;

/**
 * 图标类型
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/10/28
 * Time: 23:50
 */
public enum IconType {
    css_class("css类图标"), upload_file("文件图标"), css_sprite("css精灵图标");

    private final String info;

    private IconType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
