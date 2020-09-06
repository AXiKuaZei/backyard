package offer;

/**
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，
 * 11 翻译成 “l”，……，25 翻译成 “z”。
 * 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 

示例 1:

输入: 12258
输出: 5
解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 */
public class Offer46 {
    public static void main(String[] args){
        System.out.println(translateNum(12258));
    }
    public static int translateNum(int num) {
        if(num<100){
            if(num<26 && num>9){
                return 2;
            }else{
                return 1;
            }
        }
        int count=0;
        int nextNum = num/10;
        int nextNextNum = num/100;
        int curr = num%100;
        if(9<curr && curr<26){
            count = translateNum(nextNum) + translateNum(nextNextNum);
        }else{
            count = translateNum(nextNum);
        }
        return count;
    }
}
