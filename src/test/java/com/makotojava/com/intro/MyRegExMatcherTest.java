package com.makotojava.com.intro;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aronwong on 8/16/17.
 */
public class MyRegExMatcherTest {
    @Test
    public void testMatchesAll() {
        MyRegExMatcher classUnderTest = new MyRegExMatcher();

        String input = "The quick brown fox jumped over the lazy dogs";
        String regEx = ".*x.*l.*";
        boolean matches = classUnderTest.matchesAll(regEx, input);

        Assert.assertTrue(matches);
    }
}
