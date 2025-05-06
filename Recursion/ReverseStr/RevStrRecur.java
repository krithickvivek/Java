package Recursion.ReverseStr;
import java.util.*;
public class RevStrRecur 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = input.nextLine();
        System.out.println("Reverse ");
        System.out.println("   Method 1 : "+rev1(s, "", s.length()-1));  
        System.out.println("   Method 2 : "+rev2(s));     
        System.out.println("   Method 3 : "+rev3(s)); 
    }

    public static String rev1(String s, String ans, int i)
    {
        if (i < 0)
        {
            return ans;
        }      
        return rev1(s, ans + s.charAt(i), i-1);
    }  

    public static String rev2(String s)
    {
        if (s.length() == 0)
        {
            return "";
        }      
        return s.charAt(s.length()-1) + rev2(s.substring(0, s.length()-1));
    } 
    public static String rev3(String s)
    {
        if(s.length()==0||s.isEmpty())
        {
            return "";
        }
        return rev3(s.substring(1)) +s.charAt(0);   
    }
}
