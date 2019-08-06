interface Sayable{
    void say();
}
public class MethodReferrence {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
        // Referring static method  
        Sayable sayable = MethodReferrence::saySomething;
        // Calling interface method  
       // sayable.say();
    }
}  