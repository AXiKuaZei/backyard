


public class Huawei02 {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        boolean[][] seats = new boolean[n+1][11];
        int ans = 0;
        for(int i=0;i<reservedSeats.length;i++){
                seats[reservedSeats[i][0]][reservedSeats[i][1]] = true;
        }
        for(int i=1;i<n+1;i++){
            if(!(seats[i][2] || seats[i][3] || seats[i][4]|| seats[i][5])){
                ans++;
            }
            if(!(seats[i][6] || seats[i][7] || seats[i][8]|| seats[i][9])){
                ans++;
            }
            if((seats[i][2] || seats[i][3]) && (seats[i][8]|| seats[i][9]) && !(seats[i][4] || seats[i][5] || seats[i][6] || seats[i][7])){
                ans++;
            }
        }
        return ans;
    }
}

