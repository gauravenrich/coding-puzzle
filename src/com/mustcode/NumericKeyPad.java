package com.mustcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumericKeyPad {
    static Map<Character, String[]> map = new HashMap<>();

    static {
        map.put('2', new String[]{"a", "b", "c"});
        map.put('3', new String[]{"d", "e", "f"});
        map.put('4', new String[]{"g", "h", "i"});
        map.put('5', new String[]{"j", "k", "l"});
        map.put('6', new String[]{"m", "n", "o"});
        map.put('7', new String[]{"p", "q", "r", "s"});
        map.put('8', new String[]{"t", "u", "v"});
        map.put('9', new String[]{"w", "x", "y", "z"});
    }

    public static void main(String[] args) {
        NumericKeyPad obj = new NumericKeyPad();
        List<String> result = obj.letterCombinations("23");
        System.out.println(result);

    }

    public List<String> letterCombinations(String digits) {
        List<String> combs = new ArrayList<>();
        if (digits.length() == 0) {
            return combs;
        }
        combUtil(0, digits, new StringBuilder(), combs);
        return combs;
    }

    private void combUtil(int idx, String digits, StringBuilder sb, List<String> combs) {
        if (idx == digits.length()) {
            combs.add(sb.toString());
            return;
        }
        char ch = digits.charAt(idx);
        for (String str : map.get(ch)) {
            sb.append(str);
            combUtil(idx + 1, digits, sb, combs);
            sb.delete(sb.length() - 1, sb.length());
        }
    }
}
