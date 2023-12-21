package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        StringTokenizer str = new StringTokenizer(query,delimiter);
        String[ ] tokens = new String[str.countTokens()];
        for (int i = 0; str.hasMoreTokens(); i++) {
            tokens[i] = str.nextToken();
        }
        return tokens;
    }
}
