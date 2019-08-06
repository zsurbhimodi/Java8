import java.util.ArrayList;
import java.util.List;

public class Java8StreamsFilter {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        names.stream().filter(name->name.length()>5).forEach(System.out::println);


//  Output :

//  One
//  Two
//  Three
    }
}
