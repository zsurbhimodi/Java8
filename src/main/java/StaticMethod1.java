
interface InterfaceWithDefaultAndStaticMethod
{
    void abstractMethod();           //Abstract Method

    default void defaultMethod()
    {
        System.out.println("It is a default method");
    }

    static void staticMethod()
    {
        System.out.println("It is a static method");
    }
}

public class StaticMethod1 implements InterfaceWithDefaultAndStaticMethod
{
    @Override
    public void abstractMethod()
    {
        System.out.println("Abstract Method implemented");
    }

    //No need to implement defaultMethod()

    //Can't implement staticMethod()
}