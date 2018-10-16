package org.wss.core;

import java.util.List;
import java.util.ArrayList;

class LongestSubstring {
 
    public int lengthOfLongestSubstring(String s) {
        int response = 0;
        if (null == s || s.isEmpty()) {
            return response;
        }
        System.out.println(s + " lenght :" + s.length());
        List<Character> subS = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(subS.contains(c)) {
                subS = new ArrayList<>();
                subS.add(c);    
                continue;
            }
            subS.add(c);
            response = (subS.size() > response) ? subS.size() : response;
        }
        return response;
    }

    public static void main(String[] argv) {
        LongestSubstring sub = new LongestSubstring();
        System.out.println(sub.lengthOfLongestSubstring("aabcdef1234055"));
    }
 
}
