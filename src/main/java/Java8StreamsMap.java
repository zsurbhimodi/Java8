import java.util.ArrayList;
import java.util.List;

public class Java8StreamsMap {


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

//Returns length of each name
        names.stream().map(String::length).forEach(System.out::println);

//  Output :

//  5
//  7
//  9
//  7
//  4


    }
}
