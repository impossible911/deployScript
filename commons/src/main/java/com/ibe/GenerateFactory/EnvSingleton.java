package com.ibe.GenerateFactory;

import com.ibe.common.buildObj.Reflects;
import com.ibe.common.exception.IllegalAssert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EnvSingleton {

    private static volatile Map<String, Object> singletonPools = new ConcurrentHashMap<>();

    private EnvSingleton() {
    }

    @SuppressWarnings("unchecked")
    public static <T> T getSingle(Class<T> clazz) {
        IllegalAssert.notNull(clazz, "class must be not null");
        T obj = (T) singletonPools.get(clazz.getName());
        if (obj == null) {
            synchronized (EnvSingleton.class) {
                obj = (T) singletonPools.get(clazz.getName());
                if (obj == null) {
                    obj = Reflects.getNewObj(clazz);
                    singletonPools.put(clazz.getName(), obj);
                }
            }
        }
        return obj;
    }
}
