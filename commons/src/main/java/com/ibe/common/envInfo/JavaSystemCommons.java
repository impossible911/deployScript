package com.ibe.common.envInfo;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * Java系统环境操作工具类
 * </>
 *
 * @author zhanghao
 * @since jdk1.8
 */
public class JavaSystemCommons {

    static class NullArgs {
        private static final String NullString = "NULL";
        private static final String Empty_String = "";
        private final List<?> Empty_List = Collections.EMPTY_LIST;
        private final Set<?> Empty_Set = Collections.EMPTY_SET;
        private final Map<?, ?> Empty_Map = Collections.EMPTY_MAP;
    }

    public static String get(String name) {
        String values = NullArgs.Empty_String;
        try {
            values = System.getProperty(name);
        } catch (SecurityException e) {
            //TODO
        }
        if (isBlank(values)) {
            try {
                values = System.getenv(name);
            } catch (SecurityException e) {
                //TODO
            }
        }
        return isBlank(values) ? NullArgs.Empty_String : values;
    }

    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(final CharSequence cs) {
        return !isBlank(cs);
    }

}
