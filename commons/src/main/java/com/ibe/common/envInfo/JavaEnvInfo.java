package com.ibe.common.envInfo;

import java.io.Serializable;

/**
 * <p>
 * 当前Java 运行环境变量信息<br/>
 * 按照环境变量key为前缀拆分内容,这里只包含以Java开头的环境信息<br/>
 * 示例:
 * <code>java.vendor.url</code><br/>
 * <code>java.ext.dirs</code><br/>
 * 按照 vendor、ext 继续拆分为内部类
 * </p>
 *
 * @author zhanghao
 * @since jdk1.8
 */
public class JavaEnvInfo implements Serializable {

    private static final long serialVersionUID = 1982828172325366794L;

    /**
     * Java 供应商
     */
    private final String JAVA_VENDOR = JavaSystemCommons.get(SystemEnvInfoKey.Vendor.JAVA_VENDOR);
    private final String JAVA_VENDOR_URL = JavaSystemCommons.get(SystemEnvInfoKey.Vendor.JAVA_VENDOR_URL);
    private final String JAVA_VENDOR_URL_BUG = JavaSystemCommons.get(SystemEnvInfoKey.Vendor.JAVA_VENDOR_URL_BUG);

    /**
     * spec
     */

    private final String JAVA_SPECIFICATION_VERSION = JavaSystemCommons.get(SystemEnvInfoKey.specification.JAVA_SPECIFICATION_VERSION);
    private final String JAVA_SPECIFICATION_VENDOR = JavaSystemCommons.get(SystemEnvInfoKey.specification.JAVA_SPECIFICATION_VENDOR);
    private final String JAVA_SPECIFICATION_NAME = JavaSystemCommons.get(SystemEnvInfoKey.specification.JAVA_SPECIFICATION_NAME);

    /**
     * jvm
     */
    private final String JAVA_VM_INFO = JavaSystemCommons.get(SystemEnvInfoKey.VM.JAVA_VM_INFO);
    private final String JAVA_VM_VERSION = JavaSystemCommons.get(SystemEnvInfoKey.VM.JAVA_VM_VERSION);
    private final String JAVA_VM_NAME = JavaSystemCommons.get(SystemEnvInfoKey.VM.JAVA_VM_NAME);
    private final String JAVA_VM_VENDOR = JavaSystemCommons.get(SystemEnvInfoKey.VM.JAVA_VM_VENDOR);
    private final String JAVA_VM_SPECIFICATION_VERSION = JavaSystemCommons.get(SystemEnvInfoKey.VM.JAVA_VM_SPECIFICATION_VERSION);
    private final String JAVA_VM_SPECIFICATION_VENDOR = JavaSystemCommons.get(SystemEnvInfoKey.VM.JAVA_VM_SPECIFICATION_VENDOR);
    private final String JAVA_VM_SPECIFICATION_NAME = JavaSystemCommons.get(SystemEnvInfoKey.VM.JAVA_VM_SPECIFICATION_NAME);

    /**
     * 常用环境信息
     */
    private final String JAVA_VERSION = JavaSystemCommons.get(SystemEnvInfoKey.Others.JAVA_VERSION);
    private final String JAVA_HOME = JavaSystemCommons.get(SystemEnvInfoKey.Others.JAVA_HOME);
    private final String JAVA_RUNTIME_VERSION = JavaSystemCommons.get(SystemEnvInfoKey.Others.JAVA_RUNTIME_VERSION);
    private final String JAVA_RUNTIME_NAME = JavaSystemCommons.get(SystemEnvInfoKey.Others.JAVA_RUNTIME_NAME);
    private final String JAVA_LIBRARY_PATH = JavaSystemCommons.get(SystemEnvInfoKey.Others.JAVA_LIBRARY_PATH);
    private final String JAVA_CLASS_PATH = JavaSystemCommons.get(SystemEnvInfoKey.Others.JAVA_CLASS_PATH);
    private final String JAVA_AWT_PRINTERJOB = JavaSystemCommons.get(SystemEnvInfoKey.Others.JAVA_AWT_PRINTERJOB);
    private final String JAVA_AWT_GRAPHICSENV = JavaSystemCommons.get(SystemEnvInfoKey.Others.JAVA_AWT_GRAPHICSENV);
    private final String JAVA_IO_TMPDIR = JavaSystemCommons.get(SystemEnvInfoKey.Others.JAVA_IO_TMPDIR);
    private final String JAVA_ENDORSED_DIRS = JavaSystemCommons.get(SystemEnvInfoKey.Others.JAVA_ENDORSED_DIRS);
    private final String JAVA_CLASS_VERSION = JavaSystemCommons.get(SystemEnvInfoKey.Others.JAVA_CLASS_VERSION);
    private final String JAVA_EXT_DIRS = JavaSystemCommons.get(SystemEnvInfoKey.Others.JAVA_EXT_DIRS);

    public String getJAVA_VENDOR() {
        return JAVA_VENDOR;
    }

    public String getJAVA_VENDOR_URL() {
        return JAVA_VENDOR_URL;
    }

    public String getJAVA_VENDOR_URL_BUG() {
        return JAVA_VENDOR_URL_BUG;
    }

    public String getJAVA_SPECIFICATION_VERSION() {
        return JAVA_SPECIFICATION_VERSION;
    }

    public String getJAVA_SPECIFICATION_VENDOR() {
        return JAVA_SPECIFICATION_VENDOR;
    }

    public String getJAVA_SPECIFICATION_NAME() {
        return JAVA_SPECIFICATION_NAME;
    }

    public String getJAVA_VM_INFO() {
        return JAVA_VM_INFO;
    }

    public String getJAVA_VM_VERSION() {
        return JAVA_VM_VERSION;
    }

    public String getJAVA_VM_NAME() {
        return JAVA_VM_NAME;
    }

    public String getJAVA_VM_VENDOR() {
        return JAVA_VM_VENDOR;
    }

    public String getJAVA_VM_SPECIFICATION_VERSION() {
        return JAVA_VM_SPECIFICATION_VERSION;
    }

    public String getJAVA_VM_SPECIFICATION_VENDOR() {
        return JAVA_VM_SPECIFICATION_VENDOR;
    }

    public String getJAVA_VM_SPECIFICATION_NAME() {
        return JAVA_VM_SPECIFICATION_NAME;
    }

    public String getJAVA_VERSION() {
        return JAVA_VERSION;
    }

    public String getJAVA_HOME() {
        return JAVA_HOME;
    }

    public String getJAVA_RUNTIME_VERSION() {
        return JAVA_RUNTIME_VERSION;
    }

    public String getJAVA_RUNTIME_NAME() {
        return JAVA_RUNTIME_NAME;
    }

    public String getJAVA_LIBRARY_PATH() {
        return JAVA_LIBRARY_PATH;
    }

    public String getJAVA_CLASS_PATH() {
        return JAVA_CLASS_PATH;
    }

    public String getJAVA_AWT_PRINTERJOB() {
        return JAVA_AWT_PRINTERJOB;
    }

    public String getJAVA_AWT_GRAPHICSENV() {
        return JAVA_AWT_GRAPHICSENV;
    }

    public String getJAVA_IO_TMPDIR() {
        return JAVA_IO_TMPDIR;
    }

    public String getJAVA_ENDORSED_DIRS() {
        return JAVA_ENDORSED_DIRS;
    }

    public String getJAVA_CLASS_VERSION() {
        return JAVA_CLASS_VERSION;
    }

    public String getJAVA_EXT_DIRS() {
        return JAVA_EXT_DIRS;
    }
}
