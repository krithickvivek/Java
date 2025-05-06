package TrailingZeros.Effecient;
import java.util.*;
public class TrailingZerosEFF 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int count=0;
        while(num>0)
        {
            count+=num/5;
            num=num/5;
        }    
        System.out.println("Trailing Zeros: "+count);
        input.close();
    }
}
