package com.ibe.common.envInfo;

import java.io.Serializable;

public class SunInfo implements Serializable {

    private static final long serialVersionUID = 8954650653032362543L;


    private static final String SUN_CPU_ISALIST =JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_CPU_ISALIST);
    private static final String SUN_DESKTOP =JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_DESKTOP);
    private static final String SUN_IO_UNICODE_ENCODING =JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_IO_UNICODE_ENCODING);
    private static final String SUN_CPU_ENDIAN =JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_CPU_ENDIAN);
    private static final String SUN_BOOT_CLASS_PATH =JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_BOOT_CLASS_PATH);
    private static final String SUN_JAVA_COMMAND =JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_JAVA_COMMAND);
    private static final String SUN_ARCH_DATA_MODEL =JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_ARCH_DATA_MODEL);
    private static final String SUN_MANAGEMENT_COMPILER =JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_MANAGEMENT_COMPILER);
    private static final String SUN_JNC_ENCODING =JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_JNC_ENCODING);
    private static final String SUN_JAVA_LAUNCHER =JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_JAVA_LAUNCHER);
    private static final String SUN_OS_PATCH_LEVEL =JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_OS_PATCH_LEVEL);
    private static final String SUN_BOOT_LIBRARY_PATH =JavaSystemCommons.get(SystemEnvInfoKey.SUN.SUN_BOOT_LIBRARY_PATH);

    public static String getSunCpuIsalist() {
        return SUN_CPU_ISALIST;
    }

    public static String getSunDesktop() {
        return SUN_DESKTOP;
    }

    public static String getSunIoUnicodeEncoding() {
        return SUN_IO_UNICODE_ENCODING;
    }

    public static String getSunCpuEndian() {
        return SUN_CPU_ENDIAN;
    }

    public static String getSunBootClassPath() {
        return SUN_BOOT_CLASS_PATH;
    }

    public static String getSunJavaCommand() {
        return SUN_JAVA_COMMAND;
    }

    public static String getSunArchDataModel() {
        return SUN_ARCH_DATA_MODEL;
    }

    public static String getSunManagementCompiler() {
        return SUN_MANAGEMENT_COMPILER;
    }

    public static String getSunJncEncoding() {
        return SUN_JNC_ENCODING;
    }

    public static String getSunJavaLauncher() {
        return SUN_JAVA_LAUNCHER;
    }

    public static String getSunOsPatchLevel() {
        return SUN_OS_PATCH_LEVEL;
    }

    public static String getSunBootLibraryPath() {
        return SUN_BOOT_LIBRARY_PATH;
    }
}
