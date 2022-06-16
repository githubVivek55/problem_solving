package com.vwake.problems;

import java.util.ArrayList;

public class StringPermutations {
    public static ArrayList<String> getPermutations(String string) {
        ArrayList<String> results = new ArrayList<>();

        if (string.length() == 1)
        {
            results.add(string);
            return results;
        }

        for (int i = 0; i < string.length(); i++)
        {
            Character firstChar = string.charAt(i);
            String otherChar = string.substring(0, i) + string.substring(i + 1);
            ArrayList<String> otherPermutations = getPermutations(otherChar);
            for (int j = 0; j < otherPermutations.size(); j++) {
                results.add(firstChar + otherPermutations.get(j));
            }
        }
        return results;
    }
}
