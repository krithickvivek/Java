package BackTracking.PermutationStr;

import java.util.*;
public class Permutation 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String to get the permutations : ");
        String a = input.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        permu(a," ",arr);
        System.out.println(arr);
        

    }
    public static void permu(String s, String ans, ArrayList<String> arr)
    {
        if(s.isEmpty())
        {
            arr.add(ans);
        }
        for(int i=0;i<s.length();i++)
        {
            String ch=""+s.charAt(i);
            String res = s.substring(0, i) + s.substring(i+1);
            permu(res,ans+ch,arr);
        }
    }
    
}

