package com.steve.utils;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.util.Date;

public class CommonDateUtil {

    @Test
    public void testDateutils() {
        System.out.println(DateUtils.isSameDay(new Date(), new Date()));
    }
}
