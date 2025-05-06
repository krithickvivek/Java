package UniqueAndDuplicatesArray;
import java.util.*;
public class UniqDupli
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int len = input.nextInt();
        int[] arr = new int[len];
        Stack<Integer> unique = new Stack<>();
        Stack<Integer> duplicates = new Stack<>();
        System.out.println("Enter the values of array: ");
        for(int i=0;i<len;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<len;i++)
        {
            int c=0;
            for(int j=0;j<len;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==1) unique.push(arr[i]);
            else if(c>1) duplicates.push(arr[i]);
            
        }
        
        System.out.println(unique);
        System.out.println(duplicates);
    }
}
