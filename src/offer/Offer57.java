package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。

序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
输入：target = 15
输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 */
public class Offer57 {

    private static  List<List<Integer>> lli = new ArrayList<>();
    public static void main(String[] args){
        // dfs(new ArrayList<Integer>(), 15, 1);
        // findContinuousSequence(15);
        for(int[] ii:findContinuousSequence(15)){
            System.out.println();
            for(int i:ii){
                System.out.print(i);
            }
        }
    }
    
    public static int[][] findContinuousSequence(int target) {
        for(int i=1;i<=target/2;i++){
            List<Integer> li = new ArrayList<>();
            int sum = 0;
            int currNum = i;
            while(sum<target){
                li.add(currNum);
                sum += currNum++;
            }
            if(sum==target){
                lli.add(li);
            }
        }

        return lli.toArray(new int[lli.size()][]);

    }

    public static void dfs(List<Integer> li, int target, int now){
        if(target==0){
            lli.add(new ArrayList<>(li));
            return;
        }
        while(now<=target){
            li.add(now);
            dfs(li, target-now, now+1);
            li.remove((Integer)now);
            now++;
        }
    }
}
