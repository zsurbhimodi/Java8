
interface Drawable{
    public void draw();
}
public class LambdaExpression {
    public static void main(String[] args) {
        int width = 10;
        Drawable drawable= ()-> {
            System.out.println("This is lambda expression");

        };

        drawable.draw();

    }
}









