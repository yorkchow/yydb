package com.yydb.common.entity.search.exception;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/2
 * Time: 23:37
 */
public final class InvalidSearchPropertyException extends SearchException {

    public InvalidSearchPropertyException(String searchProperty, String entityProperty) {
        this(searchProperty, entityProperty, null);
    }

    public InvalidSearchPropertyException(String searchProperty, String entityProperty, Throwable cause) {
        super("Invalid Search Property [" + searchProperty + "] Entity Property [" + entityProperty + "]", cause);
    }
}
