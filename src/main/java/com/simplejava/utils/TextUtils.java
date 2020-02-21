package com.simplejava.utils;

public class TextUtils {
    public static String getStringReal(String value) {
        String str = value.substring(1, value.length() - 1);
        str = str.replaceAll("\\\\n", "\n");
        str = str.replaceAll("\\\\b", "\b");
        str = str.replaceAll("\\\\r", "\r");
        str = str.replaceAll("\\\\t", "\t");
        return str;
    }

    public static String getDumpString(String value) {
        String str;
        str = value.replaceAll("\n", "\\\\n");
        str = str.replaceAll("\t", "\\\\t");
        str = str.replaceAll("\b", "\\\\b");
        str = str.replaceAll("\r", "\\\\r");
        return "\"" + str + "\"";
    }

    public static long getChar(String str) {
        String c = TextUtils.getStringReal(str);
        return c.charAt(0);
    }
}
