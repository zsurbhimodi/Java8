import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionWithForEach {

    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");
//With foreach
        list.forEach(
                (n)->System.out.println(n)
        );
  //with lambda expression
        list.forEach(System.out::println);
    }
}
