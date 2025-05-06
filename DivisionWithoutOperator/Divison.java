package DivisionWithoutOperator;

import java.util.*;
public class Divison 
{
    public static void main(String[] args) 
    {
        Scanner ip = new Scanner(System.in);
        int num1 = ip.nextInt();
        int num2 = ip.nextInt();
        int quotient=0;
        int remainder=0;
        while(num1>0 && num1>=num2)
        {
            num1=num1-num2;
            quotient+=1;
            remainder=num1;
        }
        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder: "+remainder);
        ip.close();
    }    
}
