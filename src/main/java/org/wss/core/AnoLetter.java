package org.wss.core;

import java.util.Map;
import java.util.HashMap;

public class AnoLetter {
    
    private boolean evaluateLetter(String letter, String article) {
        
        if (null == letter) {
            return true;
        }
        if (null == article) {
            return false;
        }
        Map<Character, Integer> letterMap = populateLetterMap(letter);
        char[] ch = article.toCharArray();
        
        for (Character c : ch) {
            Integer count = letterMap.get(c); 
            if (count != null) {
                letterMap.put(c, count--);
                if (count <= 0) {
                    letterMap.remove(c);
                }
            }
            if (letterMap.isEmpty()) {
                    return true;
            }
        }
        return false;
    }
    
    private Map<Character, Integer> populateLetterMap (String letter) {
        Map<Character, Integer> letterMap = new HashMap<>();
        char[] ch = letter.toCharArray();
        for (Character c : ch) {
            Integer count = letterMap.get(c); 
            if (null == count) {
                letterMap.put(c, 1);
            } else {
                letterMap.put(c, count++);
            }
        }
        return letterMap;
    }
    
    public static void main(String [] argv) {
        AnoLetter letter = new AnoLetter();
        
        System.out.println(letter.evaluateLetter("dssssssssss","sfdssssssssss"));
    }
}
