package offer;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 * 
s = "abaccdeff"
返回 "b"

s = "" 
返回 " "
 */
public class Offer50 {
    public static void main(String[] args){
        System.out.println(firstUniqChar("abaccdeff"));
        System.out.println(firstUniqChar(""));
    }

    public static char firstUniqChar(String s) {
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        HashSet<Character> memo = new HashSet<>();
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(memo.contains(chars[i])){
                if(hs.contains(chars[i])) hs.remove(chars[i]);
            }else{
                memo.add(chars[i]);
                hs.add(chars[i]);
            }
        }
        return hs.size()==0?' ':hs.iterator().next();
    }
    
}
