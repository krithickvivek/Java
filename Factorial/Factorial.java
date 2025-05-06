package Factorial;

import java.util.*;
public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = ip.nextInt();
        int fact=1;
        for(int i=1;i<=input;i++)
        {
            fact*=i;
        }
        System.out.print("Factorial: ");
        System.out.println(fact); 
        ip.close();
    }    
}
