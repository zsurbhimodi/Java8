
/*If your class doesn’t extend any class and inherit multiple
 methods with same signature from multiple interfaces
 which belong to same hierarchy, then a method from most
  specific interface is
selected (If interface X extends Y then X is more specific than Y).*/

interface InterfaceOne1
{
    default void anyMethod()
    {
        System.out.println("Hi... From Interface One");
    }
}

interface InterfaceTwo2 extends InterfaceOne1
{
    @Override
    default void anyMethod()
    {
        System.out.println("Hi... From Interface Two");
    }
}

public class DefaultMethod3 implements InterfaceOne1, InterfaceTwo2
{
    public static void main(String[] args)
    {

        new DefaultMethod3().anyMethod();
    }
}