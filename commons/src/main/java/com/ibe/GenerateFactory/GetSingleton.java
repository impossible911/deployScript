package com.ibe.GenerateFactory;

import com.ibe.common.envInfo.JavaEnvInfo;
import com.ibe.common.envInfo.OsInfo;
import com.ibe.common.envInfo.SunInfo;
import com.ibe.common.envInfo.SystemInfo;

public final class GetSingleton {

    public static JavaEnvInfo getJavaEnvInfo() {
        return EnvSingleton.getSingle(JavaEnvInfo.class);
    }

    public static OsInfo getOsInfo() {
       return EnvSingleton.getSingle(OsInfo.class);
    }

    public static SunInfo getSunInfo() {
        return EnvSingleton.getSingle(SunInfo.class);
    }

    public static SystemInfo getSystemInfo() {
        return EnvSingleton.getSingle(SystemInfo.class);
    }
}
