package com.blind75.array;

import java.util.LinkedList;
import java.util.List;

/**
 * Design an algorithm to encode a list of strings to a string.
 * The encoded string is then sent over the network and is decoded back to the original list of strings.
 * Input: ["lint","code","love","you"]
 * <p>
 * Output: ["lint","code","love","you"]
 * <p>
 * Explanation:
 * <p>
 * One possible encode method is: "lint:;code:;love:;you"
 */
public class EncodeDecodeString {
    public static void main(String[] args) {
        List<String> input = List.of("lint", "code", "love", "you");
        EncodeDecodeString encodeDecodeString = new EncodeDecodeString();
        String encodedString = encodeDecodeString.encode(input);
        System.out.println(encodedString);
        System.out.println(encodeDecodeString.decode(encodedString));
    }

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        int numOfStr = strs.size();
        List<Integer> lengths = new LinkedList<>();
        for (String s : strs) {
            lengths.add(s.length());
        }
        StringBuilder result = new StringBuilder(numOfStr + "");
        for (Integer i : lengths) {
            result.append(":").append(i);
        }
        result.append(":");
        for (String s : strs) {
            result.append(s);
        }
        return result.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new LinkedList<>();
        int i = 0;
        int numOfStr = 0;
        while (s.charAt(i) != ':') {
            numOfStr = numOfStr * 10 + (s.charAt(i) - '0');
            i++;
        }
        List<Integer> lengths = new LinkedList<>();
        i++;
        for (int j = 0; j < numOfStr; j++) {
            int leng = 0;
            while (s.charAt(i) != ':') {
                leng = leng * 10 + (s.charAt(i) - '0');
                i++;
            }
            lengths.add(leng);
            i++;
        }
        for (Integer l : lengths) {
            StringBuilder tmp = new StringBuilder();
            for (int j = 0; j < l; j++) {
                tmp.append(s.charAt(i));
                i++;
            }
            result.add(tmp.toString());
        }
        return result;
    }
}
