package com.yydb.common.entity.search.filter;

import com.google.common.collect.Lists;

import java.util.List;
/**
 * or 条件
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/2
 * Time: 23:44
 */
public class OrCondition implements SearchFilter {

    private List<SearchFilter> orFilters = Lists.newArrayList();

    OrCondition() {
    }

    public OrCondition add(SearchFilter filter) {
        this.orFilters.add(filter);
        return this;
    }

    public List<SearchFilter> getOrFilters() {
        return orFilters;
    }

    @Override
    public String toString() {
        return "OrCondition{" + orFilters + '}';
    }
}
