import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Java8StreamsMin {


    public static void main(String[] args) {

        OptionalInt min = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).min();

        System.out.println(min.getAsInt());

//Output : OptionalInt[1]

//Here, min() of IntStream will be used as we are passing an array of ints



    }
}
