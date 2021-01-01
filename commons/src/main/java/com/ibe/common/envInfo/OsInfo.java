package com.ibe.common.envInfo;

import java.io.Serializable;

public class OsInfo implements Serializable {

    private static final long serialVersionUID = -618691193678292107L;

    public static final String OS_VERSION = JavaSystemCommons.get(SystemEnvInfoKey.OS.OS_VERSION);
    public static final String OS_NAME = JavaSystemCommons.get(SystemEnvInfoKey.OS.OS_NAME);
    public static final String OS_ARCH = JavaSystemCommons.get(SystemEnvInfoKey.OS.OS_ARCH);

    public static String getOsVersion() {
        return OS_VERSION;
    }

    public static String getOsName() {
        return OS_NAME;
    }

    public static String getOsArch() {
        return OS_ARCH;
    }
}
