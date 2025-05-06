package MultiplicationRepeatedAddition;

import java.util.*;
public class Multiply 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result=0;
        for(int i=0;i<b;i++)
        {
            result+=a;            
        }
        System.out.println(result);
        sc.close();    
    }    
}
