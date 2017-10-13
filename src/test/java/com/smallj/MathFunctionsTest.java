package com.smallj;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by small on 5/27/2017.
 */
public class MathFunctionsTest {
    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(MathFunctions.multiply(2, 2), (2 * 2));
        Assert.assertEquals(MathFunctions.multiply(5, 3), (5 * 3));
        Assert.assertEquals(MathFunctions.multiply(0, 5), (0 * 5));
        Assert.assertEquals(MathFunctions.multiply(-1, 4), ( -1 * 4));
        Assert.assertEquals(MathFunctions.multiply(5, -3), (5 * -3));
        Assert.assertEquals(MathFunctions.multiply(-5, -3), (-5 * -3));
    }

}