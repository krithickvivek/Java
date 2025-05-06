package SwitchCase.HolidayOrNot;
import java.util.*;
public class SwitchHolidayorNot
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to get the Day of the Week: ");
        int num = input.nextInt();
        switch(num)
        {
            case 1,2,3,4,5:
            System.out.println("Working Day");
            break;
            case 6,7:
            System.out.println("Holiday");
            break;
            default:
            System.out.println("Invalid");
            break;
        }
    }
}
