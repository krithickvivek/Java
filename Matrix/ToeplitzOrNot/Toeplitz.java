package Matrix.ToeplitzOrNot;
public class Toeplitz {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,1,2,3},{6,5,1,2},{7,6,5,1}};
        boolean flag= true;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if(arr[i][j]!=arr[i-1][j-1])
                {
                    flag=false;
                    break;
                }
            }
        }
        if(flag) System.out.println("It is a Toeplitz Matrix");
        else System.out.println("It is not a Toeplitz Matrix");
    }
    
}
