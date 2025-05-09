package Matrix.TriangleMatrix;
public class LowerTriMat {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0},{5,3,0},{6,9,7}};
        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(j<=i){
                    if(arr[i][j]==0)
                    {
                        flag=false;
                        break;
                    }
                }
            }
        }
        if(flag) System.out.println("It is a Lower Triangle Matrix");
        else System.out.println("It is not a Lower Triangle Matrix");
    }
    
}
