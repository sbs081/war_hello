package com.makotojava.com.intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by aronwong on 8/16/17.
 */
public class MyRegExMatcher {
    public boolean matchesAll(String regex, String input) {
        boolean ret = false;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        ret = matcher.matches();
        return ret;
    }

}
