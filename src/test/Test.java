package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 6
 6 5 4 3 2 1
 5
 6 5 3 2 1
 */
public class Test {
    public static void main(String[] args){
        String s = "1 2 3 4 5 6 7 8";
        String[] ss = s.split(" ");
        //"2001:0db8:85a3:0:0:8A2E:0370:7334"
        System.out.println(Integer.parseInt("00010"));
        System.out.println(validIPAddress("f:f:f:f:f:f:f:f"));
    }

    public static String validIPAddress(String IP) {
        int len = IP.length();
        String[] ss;
        int temp;
        try{
            if(len<16 && len>6){
                ss = IP.split("\\.");
                for(String s:ss){
                    temp = Integer.parseInt(s);
                    System.out.println(temp);
                    if(temp>255 || temp<0){
                        return "Neither";
                    }
                } 
                return "IPv4";
            }else if(len<40 && len>14){
                ss = IP.split(":");
                for(String s:ss){
                    temp = Integer.parseInt(s,16);
                    if(temp>65535 || temp<0){
                        return "Neither";
                    }
                }                 
                return "IPv6"; 
            }else{
                return "Neither";
            }            
        }catch(Exception e){
            return "Neither";
        }

    }
    
}
