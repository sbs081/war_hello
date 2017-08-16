package com.makotojava.com.intro;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by aronwong on 8/16/17.
 */
public class PatternTest {
    @Test
    public void testFindMatches() {

        String input = "Do you run? Ran? No, bro, run! Bro, I ran and run.";

        String regex = "r[au]n";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int matchCount = 0;
        StringBuilder matchHolder = new StringBuilder();
        while (matcher.find()) {
            if (matchCount > 0)
                matchHolder.append(',');
            matchHolder.append(matcher.group());
            matchCount++;
        }

        System.out.println("Matches: " + matchHolder.toString());

    }
}
