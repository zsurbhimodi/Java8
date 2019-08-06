
interface InterfaceOne11
{
    default void anyMethod()
    {
        System.out.println("Hi... From Interface One");
    }
}

interface InterfaceTwo22
{
    default void anyMethod()
    {
        System.out.println("Hi... From Interface Two");
    }
}

public class DefaultMethod4 implements InterfaceOne11, InterfaceTwo22
{
    @Override
    public void anyMethod()
    {
        InterfaceOne11.super.anyMethod();
    }

    public static void main(String[] args)
    {
        new DefaultMethod4().anyMethod();
    }
}