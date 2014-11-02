package com.yydb.common.entity.search.exception;

import org.springframework.core.NestedRuntimeException;

/**
 * Search exception
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/2
 * Time: 23:32
 */
public class SearchException extends NestedRuntimeException {

    public SearchException(String msg) {
        super(msg);
    }

    public SearchException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
