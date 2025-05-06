package Recursion.IntroExample;
public class RecursionIntro 
{
    public static void main(String[] args) 
    {
        // Loop
        System.out.println("Looping Method : ");
        Loop(100);

        System.out.println();
        System.out.println();

        // Recursion
        System.out.println("Recursion Method : ");
        Recur(100);
    }
    public static void Loop(int n)
    {
        for (int i = 1; i <= n; i++) System.out.print(i+" ");
    }
    public static void Recur(int n)
    {
        if(n<1) return;
        Recur(n-1);
        System.out.print(n+" ");
    }
    
}
