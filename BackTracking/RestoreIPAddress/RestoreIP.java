import java.util.*;
public class RestoreIP 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter this IP : ");
        String val = input.nextLine();
        ArrayList<String> list = new ArrayList<>();
        String addr = "";
        int start = 0;
        int segments = 0;
        restore(list,val,addr,segments,start); 
        System.out.println(list);
    }

    private static void restore(ArrayList<String> list, String val, String addr, int segments, int start) 
    {
        if(segments>3)
        {
            if(start==val.length())
            {
                list.add(addr.substring(0, addr.length()-1));
            }
            return;
        }
        for (int i = start; i < val.length(); i++) 
        {
            String current = val.substring(start, i+1);
            if(isValid(current))
            {
                restore(list,val,addr+current+'.',segments+1,i+1);
            }    
        }
    }

    private static boolean isValid(String current) 
    {
        if(current.isEmpty() || current.length()>3 || Integer.parseInt(current)>255 || current.startsWith("0") && current.length()>1)
        {
            return false;
        }
        return true;
    }
    
    
}
