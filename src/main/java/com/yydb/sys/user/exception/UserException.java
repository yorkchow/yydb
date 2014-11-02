/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.yydb.sys.user.exception;

import com.yydb.common.exception.BaseException;

/**
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/2
 * Time: 22:59
 */
public class UserException extends BaseException {

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }

}
