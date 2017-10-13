package com.smallj;

/**
 * Created by small on 5/27/2017.
 */
public class MathFunctions {

    public static int multiply(int a, int b) {

        if ((a == 0 )  || (b == 0))
            return 0;

        int num1 = Math.abs(a);
        int num2 = Math.abs(b);

        int result = 0;

        while (num2 != 0) {
            if ((num2 & 1) == 1)
                result += num1;
            num1 <<= 1;
            num2 >>= 1;
        }

        if (((a < 0) && (b > 0)) || ((a > 0) && (b < 0)))
            return -result;
        else
            return result;
    }

}
