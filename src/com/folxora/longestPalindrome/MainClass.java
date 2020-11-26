package com.folxora.longestPalindrome;
/*
5 最长回文子串
 */
public class MainClass {
    public static void main(String[] args) {
        String out = new Solution().longestPalindrome("foxllxora");
        System.out.println(out);
    }
}

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String res = "";
        for (int len = 0; len < n; len++){
            for (int i = 0; i + len<n;i ++){
                int j = i + len;
                if  (len == 0){
                    dp[i][j] = true;
                }else if (len == 1){
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                }else {
                    dp[i][j] = (dp[i+1][j-1] && s.charAt(i) == s.charAt(j));
                }

                if (dp[i][j]&& len + 1> res.length()){
                    res = s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}