package com.folxora.lengthOfLongestSubstring;

import java.util.HashMap;
import java.util.Hashtable;

/*
 03 无重复字符的最长子串
 */
public class MainClass {
    public static void main(String[] args) {
        String s = "foxlora hello world";
        int out = new Solution().lengthOfLongestSubstring(s);
        System.out.println(out);

    }
}


class Solution{
    public int lengthOfLongestSubstring(String s){
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                //更新left值
                left = Math.max(left,map.get(s.charAt(i))+1);
            }

            map.put(s.charAt(i),i);
            max = Math.max(max,i - left +1);
        }
        return max;
    }
}

