import java.util.ArrayList;
import java.util.List;

public class Java8Streams {

    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("One");

        listOfStrings.add("Two");

        listOfStrings.add("Three");

        listOfStrings.stream().forEach(System.out::println);

//  Output :

//  One
//  Two
//  Three
    }
}
