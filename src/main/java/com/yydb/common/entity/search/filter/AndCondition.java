package com.yydb.common.entity.search.filter;

import com.google.common.collect.Lists;

import java.util.List;
/**
 * and 条件
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/2
 * Time: 23:42
 */
public class AndCondition implements SearchFilter {

    private List<SearchFilter> andFilters = Lists.newArrayList();

    AndCondition() {
    }

    public AndCondition add(SearchFilter filter) {
        this.andFilters.add(filter);
        return this;
    }

    public List<SearchFilter> getAndFilters() {
        return andFilters;
    }

    @Override
    public String toString() {
        return "AndCondition{" + andFilters + '}';
    }
}