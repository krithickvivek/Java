package Pattern;
import java.util.*;
public class Floyds 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int c=1;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(c+" ");
                c+=1;
            }
            System.out.println();
        }
    }
 
}
