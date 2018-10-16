package org.wss.core;

import java.util.List;
import java.util.ArrayList;

class SubstringConcatenation {
 
    public List<Integer> findSubstring(String s, String[] words) {
        int wordLength = 0;
        System.out.println("Input string :" +s);
        String refWord = words[0];
        wordLength = refWord.length();
        for (int i =0; i < words.length; i++) {
            System.out.println("Input word :" +words[i].substring(0, 1));
        }
        System.out.println("Word length :" +wordLength);
        
        for (int j = 0 ; j < s.length(); j++) {
            String temp = null;
            if ((j + wordLength) > s.length()) {
                temp = s.substring(j, wordLength);
            }
            if (temp != null && refWord.equals(temp)) {
                //checkNext(s, start, end, words);
                if ((j - wordLength) > 0) {
                    //checkPrevious(s, start, end, words);
                }
            }
        }
        
        return new ArrayList<>();        
    }

    private List<Integer> checkNext(String s, int start, int end, String[] words) {
        return new ArrayList<>();
    }
        
    public static void main(String[] argv) {
        String s = "barfoothefoobarman";
        SubstringConcatenation sub = new SubstringConcatenation();
        String[] words = new String[2];
        words[0] = new String("foo");
        words[1] = new String("bar");
        sub.findSubstring(s, words);
    }
    
}

