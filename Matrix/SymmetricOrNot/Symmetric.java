package Matrix.SymmetricOrNot;
public class Symmetric 
{
    public static void main(String[] args) {
        int[][] arr = {{2,3,6},{3,4,5},{6,5,9}};
        System.out.println("Original Matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]!=arr[j][i])
                {
                    flag=false;
                    break;
                }
            }
        }
        if(flag) System.out.println("It is a Symmetric Matrix");
        else System.out.println("It is not a Symmetric Matrix");
    }
}
