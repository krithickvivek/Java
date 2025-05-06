package PerfectNum;

import java.util.*;
public class Perfect 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum=0;
        int temp=num;
 
        for(int i=1;i<=temp/2;i++)
        {
            if(temp%i==0)
            {
                sum+=i;
            }
        }
        if(num==sum){
            System.out.println(num+" is a Perfect Number");
        }
        else{
            System.out.println(num+" is not a Perfect Number");
        }
        input.close();
    }
}
