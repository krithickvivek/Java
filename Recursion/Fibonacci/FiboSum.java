package Recursion.Fibonacci;
import java.util.*;
public class FiboSum  
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the range of Fibonocci series to Sum : ");
        int n = inp.nextInt();
        System.out.print("Your Fibo Sum : "+Fibo(n));
    }
    public static int Fibo(int n)
    {
        if(n==0||n==1){
            return n;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
}
