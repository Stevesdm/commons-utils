package com.steve.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

public class CommonRandomUtil {
    @Test
    public void testRandomStringUtil() {
        System.out.println(RandomStringUtils.randomNumeric(10));
    }

}
