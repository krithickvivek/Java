package Recursion.Fibonacci;
import java.util.*;
public class FiboRecur 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the range of Fibonocci series to print : ");
        int n = inp.nextInt();
        System.out.println("Your Fibo Series : ");
        Fibo(n,0,1);
    }
    public static void Fibo(int n,int a, int b)
    {
        if(n>0)
        {
             System.out.print(a+" ");
            Fibo(n-1,b,a+b);
        }  
    }
}
