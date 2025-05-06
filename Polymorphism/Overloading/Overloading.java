package Polymorphism.Overloading;
public class Overloading 
{
    public static void main(String[] args) 
    {
        int n1 = 2;
        int n2 = 4;

        calculate(n1,n2);
        calculate(n1);        
    }

    public static void calculate(int a, int b) 
    {
        System.out.println("Two parameters method : "+(a+b));
    }

    public static void calculate(int a) 
    {
        System.out.println("One parameter method : "+(a*a));
    }
}
