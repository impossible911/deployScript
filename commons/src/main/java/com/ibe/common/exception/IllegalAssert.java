package com.ibe.common.exception;

import com.ibe.common.collection.ArrayUtil;

import java.io.Serializable;

public class IllegalAssert implements ExceptionAssert, Serializable {

    private static final long serialVersionUID = -7686696802508035700L;

    public static <T> T notNull(T object, String messageInfo, Object... params) {
        if (ArrayUtil.isEmpty(params)) {
            //TODO
        }
        if (object == null) {
            throw new IllegalArgumentException(messageInfo);
        }
        return object;
    }
}
