package Matrix.DiagonalMatrix;
public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] arr = {{3,0,0,0,0},{0,5,0,0,0},{0,0,7,0,0},{0,0,0,9,0},{0,0,0,0,11}};
        boolean flag=true;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                if(i!=j)
                {
                    if(arr[i][j]!=0)
                    {
                        flag=false;
                        break;
                    }
                }
            }
        }
        if(flag) System.out.println("It is a Diagonal Matrix");
        else System.out.println("It is not a Diagonal Matrix");
    }
    
}
