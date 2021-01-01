package com.ibe.common.envInfo;

import java.io.Serializable;

public class SystemInfo implements Serializable {

    private static final long serialVersionUID = -2548009954478670564L;

    public final String FILE_SEPARATOR = JavaSystemCommons.get(SystemEnvInfoKey.System.FILE_SEPARATOR);

    public final String FILE_ENCODING = JavaSystemCommons.get(SystemEnvInfoKey.System.FILE_ENCODING);

    public final String FILE_ENCODING_PKG = JavaSystemCommons.get(SystemEnvInfoKey.System.FILE_ENCODING_PKG);

    public final String AWT_TOOLKIT = JavaSystemCommons.get(SystemEnvInfoKey.System.AWT_TOOLKIT);

    public final String USER_LANGUAGE = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_LANGUAGE);

    public final String USER_NAME = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_NAME);

    public final String USER_TIMEZONE = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_TIMEZONE);

    public final String USER_HOME = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_HOME);

    public final String USER_VARIANT = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_VARIANT);

    public final String USER_DIR = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_DIR);

    public final String USER_COUNTRY = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_COUNTRY);

    public final String USER_SCRIPT = JavaSystemCommons.get(SystemEnvInfoKey.System.USER_SCRIPT);

    public final String LINE_SEPARATOR = JavaSystemCommons.get(SystemEnvInfoKey.System.LINE_SEPARATOR);

    public final String PATH_SEPARATOR = JavaSystemCommons.get(SystemEnvInfoKey.System.PATH_SEPARATOR);

    public String getFileSeparator() {
        return FILE_SEPARATOR;
    }

    public String getFileEncoding() {
        return FILE_ENCODING;
    }

    public String getFileEncodingPkg() {
        return FILE_ENCODING_PKG;
    }

    public String getAwtToolkit() {
        return AWT_TOOLKIT;
    }

    public String getUserLanguage() {
        return USER_LANGUAGE;
    }

    public String getUserName() {
        return USER_NAME;
    }

    public String getUserTimezone() {
        return USER_TIMEZONE;
    }

    public String getUserHome() {
        return USER_HOME;
    }

    public String getUserVariant() {
        return USER_VARIANT;
    }

    public String getUserDir() {
        return USER_DIR;
    }

    public String getUserCountry() {
        return USER_COUNTRY;
    }

    public String getUserScript() {
        return USER_SCRIPT;
    }

    public String getLineSeparator() {
        return LINE_SEPARATOR;
    }

    public String getPathSeparator() {
        return PATH_SEPARATOR;
    }
}
