package offer;

import java.util.Stack;
/**
 * 数字以0123456789101112131415…的格式序列化到一个字符序列中。
 * 在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
请写一个函数，求任意第n位对应的数字。

输入：n = 3
输出：3

输入：n = 11
输出：0

 */
public class Offer44 {

    public static void main(String[] args){
        // System.out.println(findNthDigit(5));
        // System.out.println(findNthDigit(10));
        // System.out.println(findNthDigit(11));
        // System.out.println(findNthDigit(13));
        // System.out.println(findNthDigit(19));
        System.out.println(findNthDigit(1000000000));
    
    }

    public static int findNthDigit(int n) {
        if(n<10) return n;
        if(n==0) return 0;
        long pos=-1;
        int beishu=1;
        long amount=10;
        long curr=0;
        while(pos<n){
            if(pos+beishu*amount>n){
                break;
            }else{
                pos+=beishu*amount;
                curr = (int) (Math.pow(10, beishu) - 1);
                beishu++;
                amount = (int) (Math.pow(10, beishu) - Math.pow(10, beishu - 1));
            }
        }
        if(pos<n){
            long cha = n-pos;
            long dijige = cha%beishu==0?beishu:cha%beishu;
            curr+=cha%beishu==0?cha/beishu:cha/beishu+1;
            return getDijige(curr,dijige);
        }
        return 9;
    }

    public static int getDijige(long curr, long dijige){
        Stack<Integer> stack = new Stack<Integer>();
        long res = 0;
        while(curr>0){
            stack.push((int)(curr%10));
            curr/=10;
        }
        for(int i=1;i<=dijige;i++){
            res = stack.pop();
        }
        return (int)res;
    }
    
}