package com.ibe.common.envInfo;

import java.io.Serializable;

public class SystemInfo implements Serializable {
    private static final long serialVersionUID = -2548009954478670564L;

    private static final String FILE_SEPARATOR = JavaSystemCommons.get(SystemEnvInfoKey.System.FILE_SEPARATOR);
    private static final String FILE_ENCODING = JavaSystemCommons.get(SystemEnvInfoKey.System.FILE_ENCODING);
    private static final String FILE_ENCODING_PKG = JavaSystemCommons.get(SystemEnvInfoKey.System.FILE_ENCODING_PKG);
    private static final String AWT_TOOLKIT = JavaSystemCommons.get(SystemEnvInfoKey.System.AWT_TOOLKIT);
    private static final String USER_LANGUAGE = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_LANGUAGE);
    private static final String USER_NAME = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_NAME);
    private static final String USER_TIMEZONE = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_TIMEZONE);
    private static final String USER_HOME = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_HOME);
    private static final String USER_VARIANT = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_VARIANT);
    private static final String USER_DIR = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_DIR);
    private static final String USER_COUNTRY = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_COUNTRY);
    private static final String USER_SCRIPT = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_SCRIPT);
    private static final String LINE_SEPARATOR = JavaSystemCommons.get(SystemEnvInfoKey.System.LINE_SEPARATOR);
    private static final String PATH_SEPARATOR = JavaSystemCommons.get(SystemEnvInfoKey.System.PATH_SEPARATOR);

    public static String getFileSeparator() {
        return FILE_SEPARATOR;
    }

    public static String getFileEncoding() {
        return FILE_ENCODING;
    }

    public static String getFileEncodingPkg() {
        return FILE_ENCODING_PKG;
    }

    public static String getAwtToolkit() {
        return AWT_TOOLKIT;
    }

    public static String getUserLanguage() {
        return USER_LANGUAGE;
    }

    public static String getUserName() {
        return USER_NAME;
    }

    public static String getUserTimezone() {
        return USER_TIMEZONE;
    }

    public static String getUserHome() {
        return USER_HOME;
    }

    public static String getUserVariant() {
        return USER_VARIANT;
    }

    public static String getUserDir() {
        return USER_DIR;
    }

    public static String getUserCountry() {
        return USER_COUNTRY;
    }

    public static String getUserScript() {
        return USER_SCRIPT;
    }

    public static String getLineSeparator() {
        return LINE_SEPARATOR;
    }

    public static String getPathSeparator() {
        return PATH_SEPARATOR;
    }
}
