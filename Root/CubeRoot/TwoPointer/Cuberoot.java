package Root.CubeRoot.TwoPointer;
import java.util.*;
public class Cuberoot
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int l=0;
        int r=num;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if((int)(mid*mid*mid)<num) l=mid+1;
            else r=mid-1;
        }
        System.out.println(l);
        input.close();
    }
}
