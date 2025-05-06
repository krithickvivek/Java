package Root.NthRoot;
public class NthRoot 
{
    public static void main(String[] args) {
        double number=28;
        double root = 3;
        double left=0;
        double right=number;
        double middle=0;
        double err=0.000000001;
        while((right-left)>err)
        {
            middle=(left+right)/2;
            if(multi(middle,root)>number)
            {
                right=middle;
            }
            else
            {
                left=middle;
            }
        }
        System.out.println("The root is "+middle);

    }
    public static double multi(double number,double root)
    {
        double multValue=1;
        for (int i = 1; i <= root; i++) {
            multValue*=number;
        }
        return multValue;
    }
}
