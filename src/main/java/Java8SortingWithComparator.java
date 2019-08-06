import java.util.ArrayList;
import java.util.List;

public class Java8SortingWithComparator {


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

//Sorting the names according to their length

        names.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(System.out::println);

//  Output :

//  John
//  David
//  Johnson
//  Brijesh
//  Samontika
    }
}
