package Recursion.Factorial;
import java.util.*;
public class FactorialRecur 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to get the factorial : ");
        int inp=input.nextInt();
        System.out.println("The factorial of "+inp+" is : "+Fact(inp));
    }
    public static int Fact(int n)
    {
        if (n==0) return 1;
        return n*Fact(n-1);
    }
}
