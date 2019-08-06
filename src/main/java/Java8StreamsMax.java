import java.util.Arrays;
import java.util.OptionalInt;

public class Java8StreamsMax {


    public static void main(String[] args) {

        OptionalInt max = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).max();

        System.out.println(max.getAsInt());

//Output : OptionalInt[1]

//Here, min() of IntStream will be used as we are passing an array of ints



    }
}
