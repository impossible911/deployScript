package com.ibe.GenerateFactory;

import com.ibe.common.envInfo.JavaEnvInfo;
import com.ibe.common.envInfo.OsInfo;
import com.ibe.common.envInfo.SunInfo;
import com.ibe.common.envInfo.SystemInfo;

public class EnvSingleton {
    private volatile static JavaEnvInfo javaEnvInfo;
    private volatile static OsInfo osInfo;
    private volatile static SunInfo sunInfo;
    private volatile static SystemInfo systemInfo;

    private EnvSingleton() {
    }

    public static JavaEnvInfo getJavaEnvInfo() {
        if (javaEnvInfo == null) {
            synchronized (EnvSingleton.class) {
                if (javaEnvInfo == null) {
                    javaEnvInfo = new JavaEnvInfo();
                }
            }
        }
        return javaEnvInfo;
    }

    public static OsInfo getOsInfo() {
        if (osInfo == null) {
            synchronized (EnvSingleton.class) {
                if (osInfo == null) {
                    osInfo = new OsInfo();
                }
            }
        }
        return osInfo;
    }
    public static SunInfo getSunInfo() {
        if (sunInfo == null) {
            synchronized (EnvSingleton.class) {
                if (sunInfo == null) {
                    sunInfo = new SunInfo();
                }
            }
        }
        return sunInfo;
    }
    public static SystemInfo getSystemInfo() {
        if (systemInfo == null) {
            synchronized (EnvSingleton.class) {
                if (systemInfo == null) {
                    systemInfo = new SystemInfo();
                }
            }
        }
        return systemInfo;
    }


}
