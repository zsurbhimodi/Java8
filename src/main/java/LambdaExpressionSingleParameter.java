interface Sayable{
    public String say(String name);
}


public class LambdaExpressionSingleParameter {

    public static void main(String[] args) {
        Sayable s1=(name)-> "Hello"+name;

        System.out.println( s1.say(" Surbhi"));

    }


}


