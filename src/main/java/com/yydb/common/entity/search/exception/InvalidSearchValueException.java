package com.yydb.common.entity.search.exception;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/2
 * Time: 23:37
 */
public final class InvalidSearchValueException extends SearchException {

    public InvalidSearchValueException(String searchProperty, String entityProperty, Object value) {
        this(searchProperty, entityProperty, value, null);
    }

    public InvalidSearchValueException(String searchProperty, String entityProperty, Object value, Throwable cause) {
        super("Invalid Search Value, searchProperty [" + searchProperty + "], " +
                "entityProperty [" + entityProperty + "], value [" + value + "]", cause);
    }
}
