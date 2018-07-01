package com.company.DetectPangram;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Task {
    public static void main(String[] args) {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        check(pangram1);


    }

    public static boolean check2(String sentence){
        return sentence.chars()
                .filter(Character::isAlphabetic)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }

    public static boolean check(String sentence){
        System.out.println(sentence);
        String s1 = sentence.toLowerCase();
        System.out.println(s1);
        String s2 = s1.replaceAll(" ","");
        System.out.println(s2);
        String s3 = s2.replaceAll("[^a-z]", "");
        System.out.println(s3);
        char[] chars = s3.toCharArray();
        Set numberOfLetters = new HashSet();
        for (char c: chars) {
            numberOfLetters.add(c);
        }
        if (numberOfLetters.size() == 26) {
            return true;
        } else {
            return false;
        }
    }
}
