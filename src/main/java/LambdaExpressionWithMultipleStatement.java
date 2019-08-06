@FunctionalInterface
interface SayableTest{
    String say(String message);
}

public class LambdaExpressionWithMultipleStatement {

    public static void main(String[] args) {


        SayableTest sayableTest=(message)->{
            System.out.println("Check the status of application");
            String str123= "Hello"+message;
            return str123;
        };

        System.out.println(  sayableTest.say("Surbhi"));
    }

}
