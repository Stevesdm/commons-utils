package com.steve.utils;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

public class CommonArrayUtil {

    @Test
    public void test() {
        int[] array = {1, 6, 5, 4};
        int[] array2 = {21, 0, 8};
        ArrayUtils.isEmpty(array);
        ArrayUtils.isSorted(array);
        ArrayUtils.add(array, 10);
        ArrayUtils.addAll(array, array2);
        ArrayUtils.toString(array);
        Integer[] array3 = ArrayUtils.toObject(array);
    }
}
