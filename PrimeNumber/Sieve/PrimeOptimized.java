package PrimeNumber.Sieve;

import java.util.*;
public class PrimeOptimized
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean arr[] = new boolean[n+1];
        for(int i=0;i<n;i++)
        {
            arr[i]=true;
        }
        for(int i=2;i<n;i++)
        {
            if(arr[i]==true)
            {
                int m=2;
                while(i*m<=n)
                {
                    arr[i*m]=false;
                    m++;
                }
            }
        } 
        for(int j=2;j<n;j++)
        {
            if(arr[j]==true)
            {
                System.out.println(j);
            }
            
        }
        sc.close();   
    }    
}
