import java.util.Scanner;

/**
 *
 2 3
 8 4 1
 6 5 2
 */

public class Hello2 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int m = sn.nextInt();
        int n = sn.nextInt();
        int[][] memo = new int[m][n];
        boolean[][] used = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                memo[i][j] = sn.nextInt();
            }
        }
        int max = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max = Math.max(max, dfs(memo,used,i,j,1));
            }
        }
        System.out.println(max);
    }

    public static int dfs (int[][] memo, boolean[][] used, int i, int j, int length){
        if(i<0 || j<0 || i>=memo.length || j>=memo[0].length || used[i][j]){
            return length;
        }
        used[i][j] = true;
        int max = length;
        if(i+1<memo.length && memo[i+1][j]<memo[i][j]){
            max = Math.max(max, dfs(memo, used, i+1, j,length+1));
        }
        if(i-1>=0 && memo[i-1][j]<memo[i][j]){
            max = Math.max(max, dfs(memo, used, i-1, j,length+1));
        }
        if(j+1<memo[0].length && memo[i][j+1]<memo[i][j]){
            max = Math.max(max, dfs(memo, used, i, j+1,length+1));
        }
        if(j-1>=0 && memo[i][j-1]<memo[i][j]){
            max = Math.max(max, dfs(memo, used, i, j-1,length+1));
        }
        used[i][j] = false;
        return max;
    }
}
