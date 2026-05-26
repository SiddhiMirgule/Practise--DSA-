// prefix sum for 2 d array
public class Sum2Darray {
    public static void main(String[] args) {
        int [][] arr = {{1,2},{4,5}};

        int m = arr.length;
        int n = arr[0].length;
        int [][] ans = new int[m][n];
        for(int i = 0 ; i <n ;i++){
            for(int j = 0 ; j< m ;j++){
                if(i==0 && j ==0){
                    ans[i][j]= arr[i][j];
                } else if (i == 0) {
                    ans[i][j] = arr[i][j] + ans[i][j-1];
                }
                else if (j == 0){
                    ans[i][j] = arr[i][j] + ans[i-1][j];
                }
                else{
                    ans[i][j] = arr[i][j] + ans[i-1][j]+ans[i][j-1] - ans[i-1][j-1];
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(" "+ ans[i][j]+" " );
            }

        }
    }
}
