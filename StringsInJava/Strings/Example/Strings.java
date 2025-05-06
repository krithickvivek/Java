package StringsInJava.Strings.Example;
public class Strings 
{
    public static void main(String[] args) 
    {
        String name = "Krithick";
        String student = "Krithick";  // Same memory shared for both name and student
        
        System.out.println(name==student);  // [Returns true] (Shallow Search) - checks whether they two have same address

        // Shallow Search "=="
        String tenant = new String("Krithick");  // New memory created not shared with old memories - name, student
        System.out.println(name==tenant);  // [Returns false] (Shallow Search) - checks whether they two have same address

        // Deep Search "str1.equals(str2)"
        System.out.println(name.equals(tenant)); // [Returns true] (Deep Search) - checks for the value inside the address (not the address)

        
    }
}
