import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product1 {
    int id;
    String name;
    float price;

    public Product1(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }
}


public class LambdaExpressionWithComparator {

    public static void main(String[] args) {
        List<Product1> list = new ArrayList<Product1>();

        //Adding Products
        list.add(new Product1(1, "HP Laptop", 25000f));
        list.add(new Product1(3, "Keyboard", 300f));
        list.add(new Product1(2, "Dell Mouse", 150f));

        Collections.sort(list, (p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        });

        System.out.println("Sorted List");
        for (Product1 prod : list) {

            System.out.println(prod.getId() + " " + prod.getName() + " " + prod.getPrice());

        }

    }

}

