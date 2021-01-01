package com.ibe.common.envInfo;

import java.io.Serializable;

public class OsInfo implements Serializable {

    private final long serialVersionUID = -618691193678292107L;

    public final String OS_VERSION = JavaSystemCommons.get(SystemEnvInfoKey.OS.OS_VERSION);

    public final String OS_NAME = JavaSystemCommons.get(SystemEnvInfoKey.OS.OS_NAME);

    public final String OS_ARCH = JavaSystemCommons.get(SystemEnvInfoKey.OS.OS_ARCH);

    public String getOS_VERSION() {
        return OS_VERSION;
    }

    public String getOS_NAME() {
        return OS_NAME;
    }

    public String getOS_ARCH() {
        return OS_ARCH;
    }
}
