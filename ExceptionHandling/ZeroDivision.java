package ExceptionHandling;
import java.util.*;
public class ZeroDivision 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBERS TO DIVIDE ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = 0;
        try
        {
            result = num1/num2;
        }
        catch(ArithmeticException exception)
        {
            System.out.println("Number cannot be divided by zero");
        }
        finally
        {
            System.out.println("Result : "+result);
        }
    }    
}
