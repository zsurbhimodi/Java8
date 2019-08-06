import java.util.Arrays;
import java.util.List;

public class MethodRefererrence {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("SS","tt","66","ee");
      //  names.forEach(str-> System.out.println(str));

        names.forEach(System.out::println);

    }
}
