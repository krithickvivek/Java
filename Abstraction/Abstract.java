package Abstraction;
public class Abstract 
{
    public static void main(String[] args) 
    {
        Car Benz = new Car();
        Benz.concreteMethod();
        Benz.complyRegulations();
        Benz.checkCapacity();
    }
}
abstract class Vehicle
{
    int id;
    String name;

    public abstract void complyRegulations();
    public abstract void checkCapacity();
    public void concreteMethod()
    {
        System.out.println("This is a concrete method");
    }
}
class Car extends Vehicle
{
    public void complyRegulations()
    {
        System.out.println("This is a Abstract method");
    }
    public void checkCapacity()
    {
        System.out.println("This is a Abstract method");
    }
    
}
