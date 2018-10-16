package org.wss.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramD {

    private Map<String, List<String>> mapAnagrams(List<String> words) {
        Map<String, List<String>> data = new HashMap<>();
        if (null == words || words.isEmpty()) {
            return data;
        }
        for (String word : words) {
            System.out.println(word);
            String key = sortWord(word);
            List<String> wordList = data.get(key);
            if (null == wordList) {
                wordList = new ArrayList<>();
                data.put(key, wordList);
            }
            wordList.add(word);
        }
        return data;
    }

    private String sortWord(String word) {
        char[] c = word.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] argv) {
        AnagramD ana = new AnagramD();
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("elppa");
        words.add("java");
        words.add("vaja");
        words.add("a");
        Map<String, List<String>> data = ana.mapAnagrams(words);

        for (String key : data.keySet()) {
            System.out.println("Key : " + key + " Word list : " + data.get(key));
        }

    }

}

