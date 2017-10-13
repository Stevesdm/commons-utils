package com.steve.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.util.Date;

public class CommonLangUtils {
    @Test
    public void testString(){
        System.out.println(StringUtils.isEmpty("454456")); //flase
        System.out.println(StringUtils.isNotEmpty("0.")); //true
        System.out.println(StringUtils.isNumeric("1"));  //true
        System.out.println(StringUtils.abbreviate("abcdefghij",7)); //abcd...
        System.out.println(StringUtils.capitalize("stevejobson")); //Stevejobson
        System.out.println(StringUtils.uncapitalize("Steve")); //steve
        System.out.println(StringUtils.contains("stevejobson","steve")); //true
        System.out.println(StringUtils.containsIgnoreCase("stevejobson","Steve")); //true
        System.out.println(StringUtils.deleteWhitespace("  a  b  c  "));  //abc
        System.out.println(StringUtils.startsWith("steve","s"));  //true
        System.out.println(StringUtils.startsWithIgnoreCase("steve","S")); //true
        System.out.println(StringUtils.startsWithAny("Steve",new String[]{"a","s"})); //false
        //endwith same with above
        System.out.println(StringUtils.equals("steve","steve"));  //true
        System.out.println(StringUtils.equalsIgnoreCase("Steve","steve")); //true
        System.out.println(StringUtils.indexOf("steve","e")); //2
        System.out.println(StringUtils.isAllUpperCase("Ac"));  //false
        System.out.println(StringUtils.join(new Integer[]{1,2,3,},'|')); //1|2|3
        System.out.println(StringUtils.upperCase("steveSjhjhc"));  //STEVESJHJHC
        System.out.println(StringUtils.remove("steve","e")); //stv
    }

    @Test
    public void testRandomStringUtil(){
        System.out.println(RandomStringUtils.randomNumeric(10));
    }

    @Test
    public void testDateutils(){
        System.out.println(DateUtils.isSameDay(new Date(),new Date()));
    }
}
