package com.example.junittestingappfromscratch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringManipulatorUnitTest {

    private StringManipulator stringManipulator;

    @Before
    public void setup() throws Exception {
        stringManipulator = StringManipulator.getInstance();
    }

    @Test
    public void check_isLess_Than_10() {
        String testString = "meow";
        boolean expectedResult = true;

        boolean result = (StringManipulator.getInstance().isLessThan10(testString));
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void check_Is_Less_Than_10_With_Null() {
        String testString = null;
        boolean expectedResult = false;

        boolean result = (StringManipulator.getInstance().isLessThan10(testString));
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void check_Is_Odd_Length_With_True() {
        String testString = "pursuit";
        boolean expectedResult = true;


        boolean result = StringManipulator.getInstance().isOddLength(testString);
        Assert.assertEquals(expectedResult, result);

    }


    @Test
    public void check_IsOdd_Length_With_False() {
        String testString = "pursuit!";
        boolean expectedResult = false;


        boolean result = StringManipulator.getInstance().isOddLength(testString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void check_Zipper_Words_With_Zipper() {
        String testString = "pursuit!" + "meow";
        String testString2 = "meow";
        String expectedResult = "pmuerosw";


        String result = StringManipulator.getInstance().zipperWords(testString, testString2);
        Assert.assertEquals(expectedResult, result);
    }


    @After
    public void tearDown() throws Exception {
        stringManipulator = null;
    }


}
