package com.yydb.common.repository.callback;

import com.yydb.common.entity.search.Searchable;

import javax.persistence.Query;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/3
 * Time: 0:00
 */
public final class NoneSearchCallback implements SearchCallback {


    public void prepareQL(StringBuilder ql, Searchable search) {
    }


    public void prepareOrder(StringBuilder ql, Searchable search) {
    }


    public void setValues(Query query, Searchable search) {
    }


    public void setPageable(Query query, Searchable search) {
    }
}
