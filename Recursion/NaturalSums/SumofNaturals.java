package Recursion.NaturalSums;
import java.util.*;
public class SumofNaturals 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the range of Natural numbers to Sum : ");
        int n = inp.nextInt();
        System.out.print("Your Sum of Natural NUmbers : "+SumNatural(n));
    
    }
    public static int SumNatural(int n)
    {
        if(n==0) return 0;
        return n+SumNatural(n-1);
    }
}
