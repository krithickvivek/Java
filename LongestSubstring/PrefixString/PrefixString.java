package LongestSubstring.PrefixString;
public class PrefixString 
{
    public static void main(String[] args) 
    {
        String input[] = {"flower","flow","floyd"};
        String pre = input[0];    //  Taking the first element of the list as the prefix at first
        for (int i = 1; i < input.length; i++) 
        {
            
           //  Checks when the both pre and the next value are equal by indexOf where if its 0 then its prefix if not it isnt the prefix
            while(input[i].indexOf(pre)!=0)  // can also be--->while(!input[i].startsWith(pre))
            {                                // --->Checks whether the element in array other than pre is starting with the pre 
                pre=pre.substring(0,pre.length()-1);   // So if its not the pre string last element is removed

                if(pre.isEmpty())   // Checks whether the pre is empty if empty no prefix in the array
                {
                    break;
                }
            }
        }
        System.out.println(pre);
    }
}
