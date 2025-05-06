package BitManipulation;

public class Bit 
{
    public static void main(String[] args)
    {
        int a=16;
        int b=5;
        System.out.println("Bit-wise AND: "+(a&b));
        System.out.println("Bit-wise OR: "+(a|b));
        System.out.println("Bit-wise XOR: "+(a^b));
        System.out.println("Bit-wise NOT: "+(~b));

        // Using & to find a num is Even or Odd

        if((a&1)==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

        // Using & finding power of 2

        if((a & a-1)==0)
        {
            System.out.println("Power");
        }
        else
        {
            System.out.println("Not a power");
        }

        // Complement

        int len = Integer.toBinaryString(b).length(); 
        int mask = (1<<len)-1;
        System.out.println("Complement of b : "+(mask^b));

        // Reverse

        int num1 = 10;
        int ans=0;
        int last = 0;
        for (int i = 0; i < 4; i++)
        {
            last=num1&1;
            ans<<=1;
            ans|=last;
            num1>>=1;
        }
        System.out.println("Integer value: "+ans);
        System.out.println("Binary value: "+Integer.toBinaryString(ans));

        // Swapping of numbers without 3rd variable

        int val1=3;
        int val2=8;
        System.out.println("Val1 : "+val1+" Val2 : "+val2);
        val1 = val1 ^ val2;
        val2 = val1 ^ val2;
        val1 = val1 ^ val2;
        System.out.println("Val1 : "+val1+" Val2 : "+val2);

        // Count of 1s in a binary 

        int digit=77;
        int instring = Integer.toBinaryString(digit).length();
        int count=0;
        int l=0;
        System.out.print("No of 1s in "+digit+" binary : ");
        for (int i = 0; i < instring; i++)
        {
            l=digit&1;
            if(l==1)
            {
                count+=1;
            }
            digit>>=1;
        }
        System.out.println(count);

        // Find the anomaly in the string

        String Str1 = "Krithick";
        String Str2 = "Krithxick";
        int index=0;
        char c = ' ';
        for (int i = 0; i < Str1.length(); i++) 
        {
            if((Str1.charAt(i)^Str2.charAt(i))!=0)
            {
                index=i;
                c=Str2.charAt(index);
                break;
            }
        }
        if (index!=0)
        {
            System.out.println("The anomaly : "+c);
        }
        else
        {
            System.out.println("The anomaly : "+Str2.charAt(Str2.length()-1));
        }
        // Finding Anomaly effecient

        String str1 = "Hello";
        String str2 = "Hellwo";
        char res=0;
        String concat = str1+str2;
        char[] conchar = concat.toCharArray();
        for (int i = 0; i < conchar.length; i++) 
        {
            res^=conchar[i];
        }
        System.out.println("The Anomaly (Efficient) : "+res);

    }    
   
}
