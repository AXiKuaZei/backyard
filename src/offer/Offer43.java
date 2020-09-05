package offer;


public class Offer43 {
    public static void main(String[] args){
        System.out.println(countDigitOne(13));
    }

    public static int countDigitOne(int n) {
        int sum = 0;
        int beishu=1;
        int before = n/beishu/10;
        int after = n%beishu;
        int curr = n/beishu%10;
        while(before!=0 || curr!=0){
            if(curr==0){
                sum+=before*beishu;
            }else if(curr == 1){
                sum+=before*beishu+after+1;
            }else{
                sum+=(before+1)*beishu;
            }
            beishu*=10;
            curr = before%10;
            before = before/10;
            after = n%beishu;
            
        }
        return sum;
    }
}
