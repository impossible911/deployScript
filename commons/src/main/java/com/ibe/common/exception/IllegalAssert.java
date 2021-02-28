package com.ibe.common.exception;

import java.io.Serializable;

public class IllegalAssert implements ExceptionAssert, Serializable {

    private static final long serialVersionUID = -7686696802508035700L;

    public static <T> T notNull(T object, String messageInfo, Object... params) {
        if (object == null) {
            throw new IllegalArgumentException(messageInfo);
        }
        return object;
    }
}
