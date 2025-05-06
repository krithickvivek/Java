package BackTracking.GenParenthesis;
import java.util.*;
public class GenerateParenthesis 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        System.out.println("Generated Valid Parenthesis : ");
        GenParenthesis(n,arr,"",0,0);
        System.out.println(arr);
    }
    public static void GenParenthesis(int n,ArrayList<String> arr,String ans,int open,int close)
    {
        if(open==close & ans.length()==2*n ) arr.add(ans);
        if(open<n) GenParenthesis(n, arr, ans+'(', open+1, close);
        if(close<open) GenParenthesis(n, arr, ans+')', open, close+1);
    }
}
