package SwitchCase.Calculator;
import java.util.*;
public class SwitchCalc 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int choice=0;
        while(choice!=5)
        {
            System.out.println("Your choice \n 1-> Addition \n 2-> Subtraction \n 3-> Multiplication \n 4-> Division \n 5-> Exit");
            choice = input.nextInt();
            if(choice==5)
            {
                System.out.println("Exiting...");
                break;
            } 
            else
            {
                System.out.print("Enter two numbers for calculation: ");
                int a = input.nextInt();
                int b = input.nextInt();
                switch(choice)
                {
                    case 1:
                    add(a,b);
                    break;
                    case 2:
                    sub(a,b);
                    break;
                    case 3:
                    mul(a,b);
                    break;
                    case 4:
                    div(a,b);
                    break;
                    case 5:
                    System.out.println("Exiting...");
                    break;
                    
                    default:
                    System.out.println("Invalid Choice\nRetry");
                } 
        }

        }
    }
    public static void add(int a,int b)
    {
        System.out.println("Addition "+(a+b)+'\n');
    }
    public static void sub(int a,int b)
    {
        System.out.println("Subtraction "+(a-b)+'\n');
    }
    public static void mul(int a,int b)
    {
        System.out.println("Multiplication "+(a*b)+'\n');
    }
    public static void div(int a,int b)
    {
        if(b!=0) System.out.println("Division "+(a/b)+'\n');
        else System.out.println("Zero Division Error"+'\n');
    }
    
}
