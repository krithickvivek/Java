package Recursion.GCD;
import java.util.*;
public class GcdRecur {
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the numbers to find the GCD : ");
        int a=inp.nextInt();
        int b=inp.nextInt();
        System.out.println("The GCD of "+a+","+b+" is "+GCD(a,b));
    }
    public static int GCD(int a,int b)
    {
        if(b==0) return a;
        return GCD(b,a%b);
    }
}
