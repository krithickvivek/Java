package StringsInJava.StringBuilder.Example;
public class StringBuilders
{
    

    public static void main(String[] args) 
    {
        StringBuilder build = new StringBuilder("Numbers are: ");
        for(int i=1;i<=10;i++) build.append(" "+i);
        System.out.println("OUTPUT->"+build);
        StringBuilder build2 = new StringBuilder("Krithick");
        System.out.println(build2.capacity());
    }    
}
