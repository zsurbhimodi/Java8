

interface InterfaceWithDefaultMethod
{
    void abstractMethod();           //Abstract Method

    default void defaultMethod()
    {
        System.out.println("It is a default method");
    }
}

public class DefaultMethod1 implements InterfaceWithDefaultMethod
{
    @Override
    public void abstractMethod()
    {
        System.out.println("Abstract Method implemented");
    }

    //No need to implement defaultMethod()
}
