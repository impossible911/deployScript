package com.ibe.GenerateFactory;

import com.ibe.common.buildObj.Reflects;
import com.ibe.common.exception.IllegalAssert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 92862
 */
public class EnvSingleton {

    private static final Map<String, Object> SINGLETON_POOLS = new ConcurrentHashMap<>();

    private EnvSingleton() {
    }

    @SuppressWarnings("unchecked")
    public static <T> T getSingle(Class<T> clazz) {
        IllegalAssert.notNull(clazz, "class must be not null");
        T obj = (T) SINGLETON_POOLS.get(clazz.getName());
        if (obj == null) {
            synchronized (EnvSingleton.class) {
                obj = (T) SINGLETON_POOLS.get(clazz.getName());
                if (obj == null) {
                    obj = Reflects.getNewObj(clazz);
                    SINGLETON_POOLS.put(clazz.getName(), obj);
                }
            }
        }
        return obj;
    }
}
