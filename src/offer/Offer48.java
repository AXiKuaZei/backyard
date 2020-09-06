package offer;

import java.util.HashSet;

/**
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 */
public class Offer48 {
    public static void main(String[] args){
        String s1 = "abcabcbb";
        String s2 = "pwwkew";
        String s3 = "aabaab!bb";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        char[] chars = s.toCharArray();
        int i = 0;
        int j = 0;
        int count = 0;
        while(j < s.length()){
            if(hs.contains(chars[j])){
                count = Math.max(count, hs.size());
                char temp = chars[j];
                while(chars[i]!=temp){
                    hs.remove(chars[i++]);
                }
                i++;
            }else{
                hs.add(chars[j]);
            }
            j++;
        }
        count = Math.max(count, hs.size());
        return count;
    }
    
}
