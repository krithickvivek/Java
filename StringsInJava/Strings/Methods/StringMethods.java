package StringsInJava.Strings.Methods;
public class StringMethods 
{
    public static void main(String[] args) 
    {
        String name1 = "Tony Stark";
        String name2 = "Peter Parker";
        String name3 = "Doctor Doom";
        String name4 = "Krithick";
        
        System.out.println("CharAt " +name1.charAt(4));
        System.out.println("isEmpty "+name1.isEmpty());
        System.out.println("Contains "+name1.contains("W"));
        System.out.println("equalsignorecase "+name2.equalsIgnoreCase(name3));
        System.out.println("Concat "+name1.concat(name2));
        System.out.println("Startswith "+name2.startsWith("Y"));
        System.out.println("Endswith "+name2.endsWith("e"));
        System.out.println("Length "+name1.length());
        System.out.println("Replace "+name1.replace("a", "o"));

        String sub = name4.substring(7);
        System.out.println("Substring "+sub);
        
        String name5 = " Sky is beautiful ";
        String trimmed = name5.trim();
        System.out.println("Trim "+trimmed);
    }
}
