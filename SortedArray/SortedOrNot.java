package SortedArray;
import java.util.*;
public class SortedOrNot 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        boolean flag=true;
        for(int i=0;i<size;i++) arr[i] = input.nextInt();
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]<arr[i+1]) flag=true;
            else
            {
                flag=false;
                break;
            }
        }
        if(flag) System.out.println("Sorted");
        else System.out.println("Not Sorted");

    }

}
