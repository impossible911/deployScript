package com.ibe.GenerateFactory;

import com.ibe.common.envInfo.JavaEnvInfo;
import com.ibe.common.envInfo.OsInfo;
import com.ibe.common.envInfo.SunInfo;
import com.ibe.common.envInfo.SystemInfo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class GetSingleton {

    private static volatile Map<String, Object> singletonPools = new ConcurrentHashMap<>();

    /**
     * <p>
     * 临时使用的方法
     * 后续添加统一对象创建逻辑
     * </>
     *
     * @return
     */
    public static JavaEnvInfo getJavaEnvInfo() {
        JavaEnvInfo javaEnvInfo = (JavaEnvInfo) singletonPools.get("JavaEnvInfo");
        if (javaEnvInfo == null) {
            javaEnvInfo = EnvSingleton.getJavaEnvInfo();
            singletonPools.put("JavaEnvInfo", javaEnvInfo);
        }
        return javaEnvInfo;
    }

    public static OsInfo getOsInfo() {
        OsInfo osInfo = (OsInfo) singletonPools.get("OsInfo");
        if (osInfo == null) {
            osInfo = EnvSingleton.getOsInfo();
            singletonPools.put("JavaEnvInfo", osInfo);
        }
        return osInfo;
    }
    public static SunInfo getSunInfo() {
        SunInfo sunInfo = (SunInfo) singletonPools.get("sunInfo");
        if (sunInfo == null) {
            sunInfo = EnvSingleton.getSunInfo();
            singletonPools.put("JavaEnvInfo", sunInfo);
        }
        return sunInfo;
    }
    public static SystemInfo getSystemInfo() {
        SystemInfo systemInfo = (SystemInfo) singletonPools.get("systemInfo");
        if (systemInfo == null) {
            systemInfo = EnvSingleton.getSystemInfo();
            singletonPools.put("JavaEnvInfo", systemInfo);
        }
        return systemInfo;
    }
   /* public static <T> T get(Class<T> clazz) {
        if (clazz == null) {
            throw new IllegalArgumentException("Class must not be null");
        }
        String clazzName = clazz.getName();
        T object  = (T)singletonPools.get(clazzName);
        if (object == null) {
            synchronized (EnvInfoSingleton.class) {
                if (object == null) {
                    object = (T) EnvSingleton.getJavaEnvInfo();
                    singletonPools.put(clazzName, object);
                }
            }
        }
        return object;
    }*/
}
