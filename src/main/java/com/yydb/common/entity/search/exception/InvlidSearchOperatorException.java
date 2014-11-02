package com.yydb.common.entity.search.exception;

import com.yydb.common.entity.search.SearchOperator;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/2
 * Time: 23:33
 */
public final class InvlidSearchOperatorException extends SearchException {

    public InvlidSearchOperatorException(String searchProperty, String operatorStr) {
        this(searchProperty, operatorStr, null);
    }

    public InvlidSearchOperatorException(String searchProperty, String operatorStr, Throwable cause) {
        super("Invalid Search Operator searchProperty [" + searchProperty + "], " +
                "operator [" + operatorStr + "], must be one of " + SearchOperator.toStringAllOperator(), cause);
    }
}
