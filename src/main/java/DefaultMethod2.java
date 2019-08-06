
/*Rule 1 : Select classes over interfaces

If your class inherit multiple methods with same signature then a method from
super class is selected (Remember a class can inherit only one class).*/



interface InterfaceOne
{
    default void anyMethod()
    {
        System.out.println("Hi... From Interface One");
    }
}

interface InterfaceTwo extends InterfaceOne
{
    @Override
    default void anyMethod()
    {
        System.out.println("Hi... From Interface Two");
    }
}

class ClassOne implements InterfaceOne, InterfaceTwo
{
    @Override
    public void anyMethod()
    {
        System.out.println("Hi... From Class One");
    }
}

public class DefaultMethod2 extends ClassOne implements InterfaceOne, InterfaceTwo
{
    public static void main(String[] args)
    {
        new DefaultMethod2().anyMethod();
    }
}
