package Recursion.ArrSum;
import java.util.*;
public class SumOfArrRecur 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values of Array : ");
        for(int i=0;i<size;i++) arr[i] = input.nextInt(); 
        System.out.println("Sum of the Array : "+SumArr(arr,0,0)); 
    }   
    public static int SumArr(int[] n,int i,int s)
    {
        if(n.length==i) return s;
        return SumArr(n,i+1,s+n[i]);
    } 
}
