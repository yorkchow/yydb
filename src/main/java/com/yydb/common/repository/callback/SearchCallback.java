package com.yydb.common.repository.callback;

import com.yydb.common.entity.search.Searchable;

import javax.persistence.Query;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/2
 * Time: 23:59
 */
public interface SearchCallback {

    public static final SearchCallback NONE = new NoneSearchCallback();
    public static final SearchCallback DEFAULT = new DefaultSearchCallback();


    /**
     * 动态拼HQL where、group by having
     *
     * @param ql
     * @param search
     */
    public void prepareQL(StringBuilder ql, Searchable search);

    public void prepareOrder(StringBuilder ql, Searchable search);

    /**
     * 根据search给query赋值及设置分页信息
     *
     * @param query
     * @param search
     */
    public void setValues(Query query, Searchable search);

    public void setPageable(Query query, Searchable search);
}
