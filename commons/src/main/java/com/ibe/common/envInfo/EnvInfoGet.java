package com.ibe.common.envInfo;

import com.ibe.GenerateFactory.GetSingleton;

public class EnvInfoGet {

    public static JavaEnvInfo getJavaEnvInfo() {
        return GetSingleton.getJavaEnvInfo();
    }

    public static OsInfo getOsInfo() {
        return GetSingleton.getOsInfo();
    }

    public static SunInfo getSunInfo() {
        return GetSingleton.getSunInfo();
    }

    public static SystemInfo getSystemInfo() {
        return GetSingleton.getSystemInfo();
    }

}
