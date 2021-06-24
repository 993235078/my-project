package com.example.meituan.util;


import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: Irvin
 * @date: Created in 2020/1/11 16:54
 */
public class RandomStringUtils {

    public static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";

    public static final String UPPER_CASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String DIGITAL = "0123456789";

    public static final String ALL = LOWER_CASE_LETTERS + UPPER_CASE_LETTERS + DIGITAL;

    /**
     * @param length 长度
     * @param base   指定字符串
     * @return java.lang.String
     * @description 通过长度和指定的字符串中获取随机字符串
     * @author Irvin
     * @date 2020/1/11 16:56
     */
    public static String getString(int length, String base) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }


    /**
     * @param str 需要处理的字符串
     * @return java.lang.String
     * @author Irvin
     * @description 处理字符串，提取其中的数字
     * @date 10:05 2020/4/22 0022
     **/
    public static String getNum(String str) {
        if (StringUtils.isEmpty(str)){
            return null;
        }
        Pattern p = Pattern.compile("[^0-9]");
        Matcher m = p.matcher(str);
        return m.replaceAll("");
    }

    public static String getMapToXML(Map<String, String> param) {
        StringBuilder sb = new StringBuilder();
        sb.append("<xml>");
        for (Map.Entry<String, String> entry : param.entrySet()) {
            sb.append("<").append(entry.getKey()).append(">");
            sb.append(entry.getValue());
            sb.append("<").append(entry.getKey()).append(">");
        }
        sb.append("</xml>");
        return sb.toString();
    }
}
