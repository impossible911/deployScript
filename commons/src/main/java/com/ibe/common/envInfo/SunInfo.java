package com.ibe.common.envInfo;

import java.io.Serializable;

public class SunInfo implements Serializable {

    private static final long serialVersionUID = 8954650653032362543L;

    private final String SUN_CPU_ISALIST = JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_CPU_ISALIST);

    private final String SUN_DESKTOP = JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_DESKTOP);

    private final String SUN_IO_UNICODE_ENCODING = JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_IO_UNICODE_ENCODING);

    private final String SUN_CPU_ENDIAN = JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_CPU_ENDIAN);

    private final String SUN_BOOT_CLASS_PATH = JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_BOOT_CLASS_PATH);

    private final String SUN_JAVA_COMMAND = JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_JAVA_COMMAND);

    private final String SUN_ARCH_DATA_MODEL = JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_ARCH_DATA_MODEL);

    private final String SUN_MANAGEMENT_COMPILER = JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_MANAGEMENT_COMPILER);

    private final String SUN_JNC_ENCODING = JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_JNC_ENCODING);

    private final String SUN_JAVA_LAUNCHER = JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_JAVA_LAUNCHER);

    private final String SUN_OS_PATCH_LEVEL = JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_OS_PATCH_LEVEL);

    private final String SUN_BOOT_LIBRARY_PATH = JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_BOOT_LIBRARY_PATH);

    public String getSUN_CPU_ISALIST() {
        return SUN_CPU_ISALIST;
    }

    public String getSUN_DESKTOP() {
        return SUN_DESKTOP;
    }

    public String getSUN_IO_UNICODE_ENCODING() {
        return SUN_IO_UNICODE_ENCODING;
    }

    public String getSUN_CPU_ENDIAN() {
        return SUN_CPU_ENDIAN;
    }

    public String getSUN_BOOT_CLASS_PATH() {
        return SUN_BOOT_CLASS_PATH;
    }

    public String getSUN_JAVA_COMMAND() {
        return SUN_JAVA_COMMAND;
    }

    public String getSUN_ARCH_DATA_MODEL() {
        return SUN_ARCH_DATA_MODEL;
    }

    public String getSUN_MANAGEMENT_COMPILER() {
        return SUN_MANAGEMENT_COMPILER;
    }

    public String getSUN_JNC_ENCODING() {
        return SUN_JNC_ENCODING;
    }

    public String getSUN_JAVA_LAUNCHER() {
        return SUN_JAVA_LAUNCHER;
    }

    public String getSUN_OS_PATCH_LEVEL() {
        return SUN_OS_PATCH_LEVEL;
    }

    public String getSUN_BOOT_LIBRARY_PATH() {
        return SUN_BOOT_LIBRARY_PATH;
    }
}
