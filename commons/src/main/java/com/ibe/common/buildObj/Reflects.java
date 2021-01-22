package com.ibe.common.buildObj;

import com.ibe.common.cache.WeakMapCache;
import com.ibe.common.collection.ArrayUtil;
import com.ibe.common.exception.IllegalAssert;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * @since v1.0 反射构造对象 必须存在空参构造
 */
public class Reflects implements Serializable {

    private static final long serialVersionUID = -6888360461735173481L;

    private static final WeakMapCache<Class<?>, Constructor<?>[]> W_CACHE = new WeakMapCache<>();

    private Reflects() {

    }

    public static <T> T getNewObj(Class<T> clazz, Object... params) {
        final Constructor<T> constructor = getConstructor(clazz, params);
        try {
            if (constructor != null) {
                return constructor.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* 获取空参构造 */
    @SuppressWarnings("unchecked")
    public static <T> Constructor<T> getConstructor(Class<T> clazz, Object... params) {
        IllegalAssert.notNull(clazz, "clazz bean must be not null");
        final Constructor<?>[] constructors = getConstructors(clazz);
        for (Constructor<?> constructor : constructors) {
            if (constructor.getParameterCount() == 0) {
                setAccessible(constructor);
                return (Constructor<T>) constructor;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public static <T> Constructor<T>[] getConstructors(Class<T> clazz) {
        IllegalAssert.notNull(clazz, "clazz bean must be not null");
        Constructor<?>[] constructors = W_CACHE.get(clazz);
        if (ArrayUtil.isNotEmpty(constructors)) {
            return (Constructor<T>[]) constructors;
        }
        return (Constructor<T>[]) W_CACHE.put(clazz, getDeclaredConstructors(clazz));
    }

    /**
     * 获取所有构造函数
     */
    @SuppressWarnings("unchecked")
    public static <T> Constructor<T>[] getDeclaredConstructors(Class<T> clazz) {
        IllegalAssert.notNull(clazz, "clazz bean must be not null");
        return (Constructor<T>[]) clazz.getDeclaredConstructors();
    }

    public static <T> void setAccessible(Constructor<T> constructor) {
        if (constructor != null) {
            constructor.setAccessible(true);
        }
    }

}
