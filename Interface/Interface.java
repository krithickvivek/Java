package Interface;
public class Interface 
{
    public static void main(String[] args) 
    {
        serviceManager User = new serviceManager();
        User.cleanLocation();
        User.hourlyMessage();
        User.showIdcard();
    }
}
interface location
{
    public void cleanLocation();
    public void hourlyMessage();
}
interface defaultUser
{
    public void showIdcard();
}

class serviceManager implements location,defaultUser{

    @Override
    public void cleanLocation() 
    {
        System.out.println("Clean Location");        
    }

    @Override
    public void hourlyMessage() 
    {
        System.out.println("Hourly Message");
    }
    
    @Override
    public void showIdcard() 
    {
        System.out.println("Show ID Card");
    }
    
}

